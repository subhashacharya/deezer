package com.subhash.deezer.ui.search

import android.os.Bundle
import androidx.navigation.NavDirections
import com.subhash.deezer.R
import kotlin.Int
import kotlin.String

class SearchFragmentDirections private constructor() {
    private data class ActionSearchToAlbums(val artistId: String, val artistName: String) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_search_to_albums

        override fun getArguments(): Bundle {
            val result = Bundle()
            result.putString("artistId", this.artistId)
            result.putString("artistName", this.artistName)
            return result
        }
    }

    companion object {
        fun actionSearchToAlbums(artistId: String, artistName: String): NavDirections =
                ActionSearchToAlbums(artistId, artistName)
    }
}
