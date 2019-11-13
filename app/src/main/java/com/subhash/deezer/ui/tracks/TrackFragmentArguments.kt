package com.subhash.deezer.ui.tracks

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrackFragmentArguments(
    val artistName: String,
    val albumId: String,
    val albumTitle: String,
    val albumArt: String
) : Parcelable
