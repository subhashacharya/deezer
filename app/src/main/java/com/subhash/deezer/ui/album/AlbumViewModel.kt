package com.subhash.deezer.ui.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.subhash.deezer.repository.model.Album
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.network.NetworkRepository
import  com.subhash.deezer.repository.Result
import com.subhash.deezer.repository.getBaseResponseData
import com.subhash.deezer.ui.utils.LiveEvent
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class AlbumViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel(), AlbumEventsListener {

    private lateinit var artistName: String

    private val _viewState = MutableLiveData<AlbumsViewState>()
    val viewState: LiveData<AlbumsViewState> get() = _viewState

    private val _navigateToAlbumTracks = LiveEvent<AlbumItem>()
    val navigateToAlbumTrack: LiveData<AlbumItem> get() = _navigateToAlbumTracks

    private val disposables = CompositeDisposable()

    fun initializeArtist(artistId: String, artistName: String) {
        this.artistName = artistName
        disposables.add(
            networkRepository.getAlbums(artistId)
                .subscribeOn(Schedulers.io())
                .subscribe({
                    updateViewState(Result.Success(data = it))
                }, {
                    updateViewState(Result.Error(message = it.message, error = it))
                })
        )
    }

    private fun updateViewState(result: Result<BaseResponse<List<Album>>>) {
        val albums = result.getBaseResponseData()?.map {
            AlbumItem(it.id, it.title, artistName, it.cover_medium, it.cover_big)
        } ?: emptyList()
        _viewState.postValue(
            AlbumsViewState(
                isLoading = result is Result.Loading,
                isError = result is Result.Error,
                errorMessage = (result as? Result.Error)?.message,
                albumsResultItems = albums
            )
        )
    }

    override fun onCleared() {
        disposables.clear()
    }

    override fun onAlbumSelected(albumItem: AlbumItem) {
        _navigateToAlbumTracks.value = albumItem
    }
}