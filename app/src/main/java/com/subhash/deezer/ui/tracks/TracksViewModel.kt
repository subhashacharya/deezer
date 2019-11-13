package com.subhash.deezer.ui.tracks

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.model.Track
import com.subhash.deezer.repository.network.NetworkRepository
import com.subhash.deezer.repository.Result
import com.subhash.deezer.repository.getBaseResponseData
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class TracksViewModel @Inject constructor(
    private val networkRepository: NetworkRepository
) : ViewModel() {

    lateinit var arguments: TrackFragmentArguments

    val title: String get() = arguments.albumTitle
    val subTitle: String get() = arguments.artistName
    val coverImage: String get() = arguments.albumArt

    private val _viewState = MutableLiveData<TracksViewState>()
    val viewState: LiveData<TracksViewState> get() = _viewState

    private val disposables = CompositeDisposable()

    fun setTrackInfo(arguments: TrackFragmentArguments) {
        this.arguments = arguments
        loadTrackForAlbum(arguments.albumId)
    }

    private fun loadTrackForAlbum(albumId: String) {
        disposables.add(
            networkRepository.getTracks(albumId)
                .subscribeOn(Schedulers.io())
                .subscribe({
                    updateViewState(Result.Success(it))
                }, {
                    updateViewState(Result.Error(it.message, it))
                })
        )
    }

    private fun updateViewState(result: Result<BaseResponse<List<Track>>>) {
        val trackItems = result.getBaseResponseData()?.sortedBy { it.track_position }?.map {
            TrackItem(it.id, it.track_position.toString(), it.title, it.artist.name)
        } ?: emptyList()
        _viewState.postValue(
            TracksViewState(
                isLoading = result is Result.Loading,
                isError = result is Result.Error,
                errorMessage = (result as? Result.Error)?.message,
                trackItems = trackItems
            )
        )
    }

    override fun onCleared() {
        disposables.clear()
    }
}