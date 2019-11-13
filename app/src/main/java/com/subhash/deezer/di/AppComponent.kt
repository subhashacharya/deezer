package com.subhash.deezer.di

import com.subhash.deezer.DeezerApplication
import com.subhash.deezer.repository.network.NetworkModule
import com.subhash.deezer.ui.UiModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        NetworkModule::class,
        UiModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : AndroidInjector<DeezerApplication> {

    @Component.Factory
    abstract class Builder : AndroidInjector.Factory<DeezerApplication>
}
