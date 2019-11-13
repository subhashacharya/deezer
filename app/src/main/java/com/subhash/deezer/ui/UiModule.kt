package com.subhash.deezer.ui

import androidx.lifecycle.ViewModel
import com.subhash.deezer.MainActivity
import com.subhash.deezer.di.ActivityScoped
import com.subhash.deezer.di.FragmentScoped
import com.subhash.deezer.di.ViewModelKey
import com.subhash.deezer.ui.album.AlbumFragment
import com.subhash.deezer.ui.album.AlbumViewModel
import com.subhash.deezer.ui.search.SearchFragment
import com.subhash.deezer.ui.search.SearchViewModel
import com.subhash.deezer.ui.tracks.TracksFragment
import com.subhash.deezer.ui.tracks.TracksViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class UiModule {

    @ActivityScoped
    @ContributesAndroidInjector
    internal abstract fun mainActivity(): MainActivity

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun searchFragment(): SearchFragment

    @Binds
    @IntoMap
    @ViewModelKey(SearchViewModel::class)
    abstract fun searchViewModel(viewModel: SearchViewModel): ViewModel

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun albumFragment(): AlbumFragment

    @Binds
    @IntoMap
    @ViewModelKey(AlbumViewModel::class)
    abstract fun albumViewModel(viewModel: AlbumViewModel): ViewModel

    @FragmentScoped
    @ContributesAndroidInjector
    internal abstract fun tracksFragment(): TracksFragment

    @Binds
    @IntoMap
    @ViewModelKey(TracksViewModel::class)
    abstract fun tracksViewModel(viewModel: TracksViewModel): ViewModel
}
