package com.subhash.deezer.di

import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.core.content.ContextCompat
import com.subhash.deezer.DeezerApplication
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    fun provideContext(application: DeezerApplication): Context {
        return application.applicationContext
    }

    @Provides
    @Singleton
    fun providesInputMethodManager(context: Context): InputMethodManager {
        return requireNotNull(ContextCompat.getSystemService(context, InputMethodManager::class.java))
    }
}
