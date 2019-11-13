package com.subhash.deezer.ui.tracks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\b\u0010\u001f\u001a\u00020\u001dH\u0014J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tJ\"\u0010!\u001a\u00020\u001d2\u0018\u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$0#H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0014\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006\'"}, d2 = {"Lcom/subhash/deezer/ui/tracks/TracksViewModel;", "Landroidx/lifecycle/ViewModel;", "networkRepository", "Lcom/subhash/deezer/repository/network/NetworkRepository;", "(Lcom/subhash/deezer/repository/network/NetworkRepository;)V", "_viewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/subhash/deezer/ui/tracks/TracksViewState;", "arguments", "Lcom/subhash/deezer/ui/tracks/TrackFragmentArguments;", "getArguments", "()Lcom/subhash/deezer/ui/tracks/TrackFragmentArguments;", "setArguments", "(Lcom/subhash/deezer/ui/tracks/TrackFragmentArguments;)V", "coverImage", "", "getCoverImage", "()Ljava/lang/String;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "subTitle", "getSubTitle", "title", "getTitle", "viewState", "Landroidx/lifecycle/LiveData;", "getViewState", "()Landroidx/lifecycle/LiveData;", "loadTrackForAlbum", "", "albumId", "onCleared", "setTrackInfo", "updateViewState", "result", "Lcom/subhash/deezer/repository/Result;", "Lcom/subhash/deezer/repository/model/BaseResponse;", "", "Lcom/subhash/deezer/repository/model/Track;", "app_debug"})
public final class TracksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    public com.subhash.deezer.ui.tracks.TrackFragmentArguments arguments;
    private final androidx.lifecycle.MutableLiveData<com.subhash.deezer.ui.tracks.TracksViewState> _viewState = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.subhash.deezer.repository.network.NetworkRepository networkRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.subhash.deezer.ui.tracks.TrackFragmentArguments getArguments() {
        return null;
    }
    
    public final void setArguments(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.tracks.TrackFragmentArguments p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCoverImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.subhash.deezer.ui.tracks.TracksViewState> getViewState() {
        return null;
    }
    
    public final void setTrackInfo(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.tracks.TrackFragmentArguments arguments) {
    }
    
    private final void loadTrackForAlbum(java.lang.String albumId) {
    }
    
    private final void updateViewState(com.subhash.deezer.repository.Result<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Track>>> result) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public TracksViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.repository.network.NetworkRepository networkRepository) {
        super();
    }
}