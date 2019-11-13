package com.subhash.deezer.repository.model

data class Track(
    val id: String,
    val readable: Boolean,
    val title: String,
    val title_short: String,
    val title_version: String,
    val isrc: String,
    val link: String,
    val duration: String,
    val track_position: Int,
    val disk_number: Int,
    val rank: String,
    val explicit_lyrics: Boolean,
    val explicit_content_lyrics: Int,
    val explicit_content_cover: Int,
    val preview: String,
    val artist: Artist,
    val type: String
)
