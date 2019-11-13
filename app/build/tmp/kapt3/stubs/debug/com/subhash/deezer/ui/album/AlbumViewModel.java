package com.subhash.deezer.ui.album;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\"\u0010\u001c\u001a\u00020\u00172\u0018\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0 0\u001f0\u001eH\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/subhash/deezer/ui/album/AlbumViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/subhash/deezer/ui/album/AlbumEventsListener;", "networkRepository", "Lcom/subhash/deezer/repository/network/NetworkRepository;", "(Lcom/subhash/deezer/repository/network/NetworkRepository;)V", "_navigateToAlbumTracks", "Lcom/subhash/deezer/ui/utils/LiveEvent;", "Lcom/subhash/deezer/ui/album/AlbumItem;", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/subhash/deezer/ui/album/AlbumsViewState;", "artistName", "", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "navigateToAlbumTrack", "Landroidx/lifecycle/LiveData;", "getNavigateToAlbumTrack", "()Landroidx/lifecycle/LiveData;", "viewState", "getViewState", "initializeArtist", "", "artistId", "onAlbumSelected", "albumItem", "onCleared", "updateViewState", "result", "Lcom/subhash/deezer/repository/Result;", "Lcom/subhash/deezer/repository/model/BaseResponse;", "", "Lcom/subhash/deezer/repository/model/Album;", "app_debug"})
public final class AlbumViewModel extends androidx.lifecycle.ViewModel implements com.subhash.deezer.ui.album.AlbumEventsListener {
    private java.lang.String artistName;
    private final androidx.lifecycle.MutableLiveData<com.subhash.deezer.ui.album.AlbumsViewState> _viewState = null;
    private final com.subhash.deezer.ui.utils.LiveEvent<com.subhash.deezer.ui.album.AlbumItem> _navigateToAlbumTracks = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.subhash.deezer.repository.network.NetworkRepository networkRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.subhash.deezer.ui.album.AlbumsViewState> getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.subhash.deezer.ui.album.AlbumItem> getNavigateToAlbumTrack() {
        return null;
    }
    
    public final void initializeArtist(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId, @org.jetbrains.annotations.NotNull()
    java.lang.String artistName) {
    }
    
    private final void updateViewState(com.subhash.deezer.repository.Result<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Album>>> result) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onAlbumSelected(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.album.AlbumItem albumItem) {
    }
    
    @javax.inject.Inject()
    public AlbumViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.repository.network.NetworkRepository networkRepository) {
        super();
    }
}