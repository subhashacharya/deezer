package com.subhash.deezer.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\'J\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000fJ\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0011H\'J\r\u0010\u0012\u001a\u00020\u0013H!\u00a2\u0006\u0002\b\u0014J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0016H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/subhash/deezer/ui/UiModule;", "", "()V", "albumFragment", "Lcom/subhash/deezer/ui/album/AlbumFragment;", "albumFragment$app_debug", "albumViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/subhash/deezer/ui/album/AlbumViewModel;", "mainActivity", "Lcom/subhash/deezer/MainActivity;", "mainActivity$app_debug", "searchFragment", "Lcom/subhash/deezer/ui/search/SearchFragment;", "searchFragment$app_debug", "searchViewModel", "Lcom/subhash/deezer/ui/search/SearchViewModel;", "tracksFragment", "Lcom/subhash/deezer/ui/tracks/TracksFragment;", "tracksFragment$app_debug", "tracksViewModel", "Lcom/subhash/deezer/ui/tracks/TracksViewModel;", "app_debug"})
@dagger.Module()
public abstract class UiModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.subhash.deezer.di.ActivityScoped()
    public abstract com.subhash.deezer.MainActivity mainActivity$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.subhash.deezer.di.FragmentScoped()
    public abstract com.subhash.deezer.ui.search.SearchFragment searchFragment$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @com.subhash.deezer.di.ViewModelKey(value = com.subhash.deezer.ui.search.SearchViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel searchViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.search.SearchViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.subhash.deezer.di.FragmentScoped()
    public abstract com.subhash.deezer.ui.album.AlbumFragment albumFragment$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @com.subhash.deezer.di.ViewModelKey(value = com.subhash.deezer.ui.album.AlbumViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel albumViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.album.AlbumViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    @com.subhash.deezer.di.FragmentScoped()
    public abstract com.subhash.deezer.ui.tracks.TracksFragment tracksFragment$app_debug();
    
    @org.jetbrains.annotations.NotNull()
    @com.subhash.deezer.di.ViewModelKey(value = com.subhash.deezer.ui.tracks.TracksViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel tracksViewModel(@org.jetbrains.annotations.NotNull()
    com.subhash.deezer.ui.tracks.TracksViewModel viewModel);
    
    public UiModule() {
        super();
    }
}