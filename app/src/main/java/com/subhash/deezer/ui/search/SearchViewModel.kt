package com.subhash.deezer.ui.search

import androidx.lifecycle.*
import com.subhash.deezer.repository.Result
import com.subhash.deezer.repository.getBaseResponseData
import com.subhash.deezer.repository.model.Artist
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.network.NetworkRepository
import com.subhash.deezer.ui.utils.LiveEvent
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel(), SearchEventsListener {

    private val querySubject = PublishSubject.create<String>()
    private val disposables = CompositeDisposable()

    val searchQuery = MutableLiveData<String>("")
    private val queryInputObserver = Observer<String> {
        querySubject.onNext(it)
    }

    private val _searchViewState = MutableLiveData<SearchViewState>()
    val searchViewState: LiveData<SearchViewState> get() = _searchViewState

    private val _navigateToAlbums = LiveEvent<ArtistItem>()
    val navigateToAlbums: LiveData<ArtistItem> get() = _navigateToAlbums

    init {
        searchQuery.observeForever(queryInputObserver)
        disposables.add(subscribeToQuery())
    }

    private fun updateViewState(result: Result<BaseResponse<List<Artist>>>) {
        val artists = result.getBaseResponseData()?.map { artist ->
            ArtistItem(artist.id, artist.name, artist.picture_small)
        } ?: emptyList()
        _searchViewState.postValue(
            SearchViewState(
                isLoading = result is Result.Loading,
                isError = result is Result.Error,
                errorMessage = (result as? Result.Error)?.message,
                searchResultItems = artists
            )
        )
    }

    private fun subscribeToQuery(): Disposable {
        return querySubject
            .subscribeOn(Schedulers.io())
            .map { it.trim() }
            .debounce(QUERY_WAIT_DURATION, TimeUnit.MILLISECONDS)
            .subscribe { disposables.add(performSearch(it)) }
    }

    private fun performSearch(query: String): Disposable {
        updateViewState(Result.Loading)
        return networkRepository.searchArtists(query)
            .subscribe({
                updateViewState(Result.Success(it))
            }, {
                updateViewState(Result.Error(message = it?.message, error = it))
            })
    }

    override fun onCleared() {
        disposables.clear()
        searchQuery.removeObserver(queryInputObserver)
    }

    override fun onArtistSelected(artist: ArtistItem) {
        _navigateToAlbums.value = artist
    }

    override fun onSearchTextCleared() {
        searchQuery.value = ""
    }

    companion object {
        private const val QUERY_WAIT_DURATION = 300L //MS
    }
}
