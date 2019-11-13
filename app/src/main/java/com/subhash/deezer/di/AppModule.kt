package com.subhash.deezer.di

import android.content.Context
import com.subhash.deezer.DeezerApplication
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideContext(application: DeezerApplication): Context {
        return application.applicationContext
    }
}
