package com.subhash.deezer.ui.search

import androidx.annotation.StringRes

data class SearchViewState(
    val query: String? = null,
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String? = null,
    val searchResultItems: List<SearchResultItem> = emptyList()
)

interface SearchResultItem

data class HeaderItem(@StringRes val title: Int) : SearchResultItem
data class ArtistItem(
    val id: String,
    val title: String,
    val imageUrl: String
) : SearchResultItem

interface SearchEventsListener {
    fun onArtistSelected(artist: ArtistItem)
    fun onSearchTextCleared()
}
