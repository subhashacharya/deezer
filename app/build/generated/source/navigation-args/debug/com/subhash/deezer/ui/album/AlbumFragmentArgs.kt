package com.subhash.deezer.ui.album

import android.os.Bundle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

data class AlbumFragmentArgs(val artistId: String, val artistName: String) : NavArgs {
    fun toBundle(): Bundle {
        val result = Bundle()
        result.putString("artistId", this.artistId)
        result.putString("artistName", this.artistName)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): AlbumFragmentArgs {
            bundle.setClassLoader(AlbumFragmentArgs::class.java.classLoader)
            val __artistId : String?
            if (bundle.containsKey("artistId")) {
                __artistId = bundle.getString("artistId")
                if (__artistId == null) {
                    throw IllegalArgumentException("Argument \"artistId\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"artistId\" is missing and does not have an android:defaultValue")
            }
            val __artistName : String?
            if (bundle.containsKey("artistName")) {
                __artistName = bundle.getString("artistName")
                if (__artistName == null) {
                    throw IllegalArgumentException("Argument \"artistName\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"artistName\" is missing and does not have an android:defaultValue")
            }
            return AlbumFragmentArgs(__artistId, __artistName)
        }
    }
}
