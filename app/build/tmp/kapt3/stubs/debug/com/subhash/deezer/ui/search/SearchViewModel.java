package com.subhash.deezer.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0001,B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\bH\u0016J\b\u0010 \u001a\u00020\u001eH\u0014J\b\u0010!\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020#H\u0002J\"\u0010&\u001a\u00020\u001e2\u0018\u0010\'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)0(H\u0002R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00140\u00140\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011\u00a8\u0006-"}, d2 = {"Lcom/subhash/deezer/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/subhash/deezer/ui/search/SearchEventsListener;", "networkRepository", "Lcom/subhash/deezer/repository/network/NetworkRepository;", "(Lcom/subhash/deezer/repository/network/NetworkRepository;)V", "_navigateToAlbums", "Lcom/subhash/deezer/ui/utils/LiveEvent;", "Lcom/subhash/deezer/ui/search/ArtistItem;", "_searchViewState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/subhash/deezer/ui/search/SearchViewState;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "navigateToAlbums", "Landroidx/lifecycle/LiveData;", "getNavigateToAlbums", "()Landroidx/lifecycle/LiveData;", "queryInputObserver", "Landroidx/lifecycle/Observer;", "", "querySubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "searchQuery", "getSearchQuery", "()Landroidx/lifecycle/MutableLiveData;", "searchViewState", "getSearchViewState", "onArtistSelected", "", "artist", "onCleared", "onSearchTextCleared", "performSearch", "Lio/reactivex/disposables/Disposable;", "query", "subscribeToQuery", "updateViewState", "result", "Lcom/subhash/deezer/repository/Result;", "Lcom/subhash/deezer/repository/model/BaseResponse;", "", "Lcom/subhash/deezer/repository/model/Artist;", "Companion", "app_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel implements com.subhash.deezer.ui.search.SearchEventsListener {
    private final io.reactivex.subjects.PublishSubject<java.lang.String> querySubject = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> searchQuery = null;
    private final androidx.lifecycle.Observer<java.lang.String> queryInputObserver = null;
    private final androidx.lifecycle.MutableLiveData<com.subhash.deezer.ui.search.SearchViewState> _searchViewState = null;
    private final com.subhash.deezer.ui.utils.LiveEvent<com.subhash.deezer.ui.search.ArtistItem> _navigateToAlbums = null;
    private final com.subhash.deezer.repository.network.NetworkRepository networkRepository = null;
    private static final long QUERY_WAIT_DURATION = 300L;
    public static final com.subhash.deezer.ui.search.SearchViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.subhash.deezer.ui.search.SearchViewState> getSearchViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.subhash.deezer.ui.search.ArtistItem> getNavigateToAlbums() {
        return null;
    }
    
    private final void updateViewState(com.subhash.deezer.repository.Result<com.subhash.deezer.repository.model.BaseResponse<java.util.List<com.subhash.deezer.repository.model.Artist>>> result) {
    }
    
    private final io.reactivex.disposables.Disposable subscribeToQuery() {
        return null;
    }
    
    private final io.reactivex.disposables.Disposable performSearch(java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @java.lang.Override()
    public void onArtistSelected(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.search.ArtistItem artist) {
    }
    
    @java.lang.Override()
    public void onSearchTextCleared() {
    }
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.repository.network.NetworkRepository networkRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/subhash/deezer/ui/search/SearchViewModel$Companion;", "", "()V", "QUERY_WAIT_DURATION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}