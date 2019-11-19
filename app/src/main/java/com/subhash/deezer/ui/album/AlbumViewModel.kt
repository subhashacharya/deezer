package com.subhash.deezer.ui.album

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.subhash.deezer.repository.Result
import com.subhash.deezer.repository.getBaseResponseData
import com.subhash.deezer.repository.model.Album
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.network.NetworkRepository
import com.subhash.deezer.ui.utils.LiveEvent
import kotlinx.coroutines.launch
import javax.inject.Inject

class AlbumViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel(), AlbumEventsListener {

    private lateinit var artistName: String

    private val _viewState = MutableLiveData<AlbumsViewState>()
    val viewState: LiveData<AlbumsViewState> get() = _viewState

    private val _navigateToAlbumTracks = LiveEvent<AlbumItem>()
    val navigateToAlbumTrack: LiveData<AlbumItem> get() = _navigateToAlbumTracks

    fun initializeArtist(artistId: String, artistName: String) {
        this.artistName = artistName
        viewModelScope.launch {
            try {
                updateViewState(Result.Success(data = networkRepository.getAlbums(artistId)))
            } catch (e: Exception) {
                updateViewState(Result.Error(message = e.message, error = e))
            }
        }
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

    override fun onAlbumSelected(albumItem: AlbumItem) {
        _navigateToAlbumTracks.value = albumItem
    }
}