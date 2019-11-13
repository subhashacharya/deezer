package com.subhash.deezer.ui.tracks

data class TracksViewState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String? = null,
    val trackItems: List<TrackAdapterItem>
)

interface TrackAdapterItem

data class TrackItem(
    val trackId: String,
    val trackPosition: String,
    val trackTitle: String,
    val trackArtist: String
): TrackAdapterItem
