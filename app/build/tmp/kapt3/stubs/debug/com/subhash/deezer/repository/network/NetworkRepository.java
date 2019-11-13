package com.subhash.deezer.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'J$\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u00040\u00032\b\b\u0001\u0010\u000b\u001a\u00020\bH\'J$\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00050\u00040\u00032\b\b\u0001\u0010\u000e\u001a\u00020\bH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/subhash/deezer/repository/network/NetworkRepository;", "", "getAlbums", "Lio/reactivex/Single;", "Lcom/subhash/deezer/repository/model/BaseResponse;", "", "Lcom/subhash/deezer/repository/model/Album;", "artistId", "", "getTracks", "Lcom/subhash/deezer/repository/model/Track;", "albumId", "searchArtists", "Lcom/subhash/deezer/repository/model/Artist;", "query", "app_debug"})
public abstract interface NetworkRepository {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/artist?")
    public abstract io.reactivex.Single<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Artist>>> searchArtists(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "artist/{id}/albums")
    public abstract io.reactivex.Single<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Album>>> getAlbums(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String artistId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "album/{id}/tracks")
    public abstract io.reactivex.Single<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Track>>> getTracks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "id")
    java.lang.String albumId);
}