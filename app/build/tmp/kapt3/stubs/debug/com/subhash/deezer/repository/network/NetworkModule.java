package com.subhash.deezer.repository.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\'\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/subhash/deezer/repository/network/NetworkModule;", "", "()V", "Companion", "app_debug"})
@dagger.Module()
public abstract class NetworkModule {
    public static final com.subhash.deezer.repository.network.NetworkModule.Companion Companion = null;
    
    public NetworkModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "DeezerUrl")
    @dagger.Provides()
    public static final java.lang.String deezerUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final okhttp3.OkHttpClient provideOkHttpClient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public static final com.subhash.deezer.repository.network.NetworkRepository provideApiService(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "DeezerUrl")
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\"\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/subhash/deezer/repository/network/NetworkModule$Companion;", "", "()V", "deezerUrl", "", "provideApiService", "Lcom/subhash/deezer/repository/network/NetworkRepository;", "client", "Lokhttp3/OkHttpClient;", "url", "gson", "Lcom/google/gson/Gson;", "provideGson", "provideOkHttpClient", "app_debug"})
    @dagger.Module()
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "DeezerUrl")
        @dagger.Provides()
        public final java.lang.String deezerUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.google.gson.Gson provideGson() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final okhttp3.OkHttpClient provideOkHttpClient() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.subhash.deezer.repository.network.NetworkRepository provideApiService(@org.jetbrains.annotations.NotNull()
        okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
        @javax.inject.Named(value = "DeezerUrl")
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        com.google.gson.Gson gson) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}