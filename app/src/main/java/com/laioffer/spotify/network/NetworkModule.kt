package com.laioffer.spotify.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// object is a singleton class in Kotlin
object NetworkModule {
    private const val BASE_URL = "http://10.0.2.2:8080/" // localhost address for android emulator

    // class under object is static
    fun provideRetrofit(): Retrofit {
        // return a new Retrofit object every time
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(OkHttpClient())
            .build()
    }
}