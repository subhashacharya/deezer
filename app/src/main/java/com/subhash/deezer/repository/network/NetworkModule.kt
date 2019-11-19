package com.subhash.deezer.repository.network

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Named
import javax.inject.Singleton

@Module
abstract class NetworkModule {

    @Module
    companion object {
        @Provides
        @Named("DeezerUrl")
        @JvmStatic
        fun deezerUrl() = "https://api.deezer.com/"

        @Provides
        @Singleton
        @JvmStatic
        fun provideGson(): Gson = Gson()

        @Provides
        @Singleton
        @JvmStatic
        fun provideOkHttpClient(): OkHttpClient = OkHttpClient()

        @Provides
        @Singleton
        @JvmStatic
        fun provideApiService(
            client: OkHttpClient,
            @Named("DeezerUrl") url: String,
            gson: Gson
        ): NetworkRepository {
            return Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(NetworkRepository::class.java)
        }
    }
}
