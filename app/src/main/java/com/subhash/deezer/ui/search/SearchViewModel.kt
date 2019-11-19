package com.subhash.deezer.ui.search

import androidx.lifecycle.*
import com.subhash.deezer.R
import com.subhash.deezer.repository.Result
import com.subhash.deezer.repository.getBaseResponseData
import com.subhash.deezer.repository.model.Artist
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.network.NetworkRepository
import com.subhash.deezer.ui.utils.LiveEvent
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

class SearchViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel(), SearchEventsListener {
    val searchQuery = MutableLiveData<String>("")

    private val _searchViewState = MutableLiveData<SearchViewState>()
    val searchViewState: LiveData<SearchViewState> get() = _searchViewState

    private val _navigateToAlbums = LiveEvent<ArtistItem>()
    val navigateToAlbums: LiveData<ArtistItem> get() = _navigateToAlbums

    init {
        viewModelScope.launch {
            subscribeToQuery()
        }
    }

    private fun updateViewState(result: Result<BaseResponse<List<Artist>>>) {
        val artistsResult = result.getBaseResponseData()
        val resultItems: List<SearchResultItem> = if (artistsResult.isNullOrEmpty()) {
            emptyList()
        } else {
            mutableListOf<SearchResultItem>().apply {
                add(HeaderItem(R.string.artists_header))
                artistsResult.forEach { artist ->
                    add(ArtistItem(artist.id, artist.name, artist.picture_small))
                }
            }
        }
        _searchViewState.postValue(
            SearchViewState(
                isLoading = result is Result.Loading,
                isError = result is Result.Error,
                errorMessage = (result as? Result.Error)?.message,
                searchResultItems = resultItems
            )
        )
    }

    private suspend fun subscribeToQuery() {
        searchQuery.asFlow()
            .debounce(QUERY_WAIT_DURATION)
            .distinctUntilChanged()
            .filter { it.length > MAX_QUERY_CHARACTERS }
            .onEach {
                updateViewState(Result.Loading)
            }.collect {
                val result = try {
                    Result.Success(networkRepository.searchArtists(it))
                } catch (e: Exception) {
                    Result.Error(message = e.message, error = e)
                }
                updateViewState(result)
            }
    }

    override fun onArtistSelected(artist: ArtistItem) {
        _navigateToAlbums.value = artist
    }

    override fun onSearchTextCleared() {
        searchQuery.value = ""
    }

    companion object {
        private const val QUERY_WAIT_DURATION = 300L //MS
        private const val MAX_QUERY_CHARACTERS = 2
    }
}
