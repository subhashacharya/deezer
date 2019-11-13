package com.subhash.deezer.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/subhash/deezer/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/subhash/deezer/DeezerApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.subhash.deezer.di.AppModule.class, com.subhash.deezer.repository.network.NetworkModule.class, com.subhash.deezer.ui.UiModule.class, com.subhash.deezer.di.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.subhash.deezer.DeezerApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/subhash/deezer/di/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Factory;", "Lcom/subhash/deezer/DeezerApplication;", "()V", "app_debug"})
    @dagger.Component.Factory()
    public static abstract class Builder implements dagger.android.AndroidInjector.Factory<com.subhash.deezer.DeezerApplication> {
        
        public Builder() {
            super();
        }
    }
}