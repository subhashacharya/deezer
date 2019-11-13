package com.subhash.deezer.repository.network

import com.subhash.deezer.repository.model.Album
import com.subhash.deezer.repository.model.Artist
import com.subhash.deezer.repository.model.BaseResponse
import com.subhash.deezer.repository.model.Track
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NetworkRepository {

    @GET("search/artist?")
    fun searchArtists(@Query("q") query: String): Single<BaseResponse<List<Artist>>>

    @GET("artist/{id}/albums")
    fun getAlbums(@Path("id") artistId: String): Single<BaseResponse<List<Album>>>

    @GET("album/{id}/tracks")
    fun getTracks(@Path("id") albumId: String): Single<BaseResponse<List<Track>>>
}
