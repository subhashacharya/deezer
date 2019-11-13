package com.subhash.deezer.ui.album

data class AlbumsViewState(
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String? = null,
    val albumsResultItems: List<AlbumsResultItem> = emptyList()
)

interface AlbumsResultItem
data class AlbumItem(
    val id: String,
    val title: String,
    val artists: String,
    val albumArt: String,
    val albumCover: String
) : AlbumsResultItem

interface AlbumEventsListener {
    fun onAlbumSelected(albumItem: AlbumItem)
}
