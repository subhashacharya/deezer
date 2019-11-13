package com.subhash.deezer

import com.subhash.deezer.di.AppComponent
import com.subhash.deezer.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasAndroidInjector

class DeezerApplication : DaggerApplication(), HasAndroidInjector {

    private var appComponent: AppComponent? = null

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return getComponent()
    }

    private fun getComponent(): AppComponent {
        return appComponent ?: createComponent().also { appComponent = it }
    }

    private fun createComponent() = DaggerAppComponent.factory().create(this) as AppComponent
}
