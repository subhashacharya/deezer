package com.subhash.deezer.repository.network

import com.subhash.deezer.repository.model.Album
import com.subhash.deezer.repository.model.Artist
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.model.Track
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkRepository {

    @GET("search/artist?")
    suspend fun searchArtists(@Query("q") query: String): BaseResponse<List<Artist>>

    @GET("artist/{id}/albums")
    suspend fun getAlbums(@Path("id") artistId: String): BaseResponse<List<Album>>

    @GET("album/{id}/tracks")
    suspend fun getTracks(@Path("id") albumId: String): BaseResponse<List<Track>>
}
