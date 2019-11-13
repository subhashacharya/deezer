package com.subhash.deezer.ui.album

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.subhash.deezer.R
import com.subhash.deezer.ui.tracks.TrackFragmentArguments
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class AlbumFragmentDirections private constructor() {
    private data class ActionAlbumToTracks(val albumInfo: TrackFragmentArguments) : NavDirections {
        override fun getActionId(): Int = R.id.action_album_to_tracks

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
            val result = Bundle()
            if (Parcelable::class.java.isAssignableFrom(TrackFragmentArguments::class.java)) {
                result.putParcelable("albumInfo", this.albumInfo as Parcelable)
            } else if
                    (Serializable::class.java.isAssignableFrom(TrackFragmentArguments::class.java))
                    {
                result.putSerializable("albumInfo", this.albumInfo as Serializable)
            } else {
                throw UnsupportedOperationException(TrackFragmentArguments::class.java.name +
                        " must implement Parcelable or Serializable or must be an Enum.")
            }
            return result
        }
    }

    companion object {
        fun actionAlbumToTracks(albumInfo: TrackFragmentArguments): NavDirections =
                ActionAlbumToTracks(albumInfo)
    }
}
