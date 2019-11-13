package com.subhash.deezer.ui.tracks

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class TracksFragmentArgs(val albumInfo: TrackFragmentArguments) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(TrackFragmentArguments::class.java)) {
            result.putParcelable("albumInfo", this.albumInfo as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(TrackFragmentArguments::class.java)) {
            result.putSerializable("albumInfo", this.albumInfo as Serializable)
        } else {
            throw UnsupportedOperationException(TrackFragmentArguments::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): TracksFragmentArgs {
            bundle.setClassLoader(TracksFragmentArgs::class.java.classLoader)
            val __albumInfo : TrackFragmentArguments?
            if (bundle.containsKey("albumInfo")) {
                if (Parcelable::class.java.isAssignableFrom(TrackFragmentArguments::class.java) ||
                        Serializable::class.java.isAssignableFrom(TrackFragmentArguments::class.java))
                        {
                    __albumInfo = bundle.get("albumInfo") as TrackFragmentArguments?
                } else {
                    throw UnsupportedOperationException(TrackFragmentArguments::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__albumInfo == null) {
                    throw IllegalArgumentException("Argument \"albumInfo\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"albumInfo\" is missing and does not have an android:defaultValue")
            }
            return TracksFragmentArgs(__albumInfo)
        }
    }
}
