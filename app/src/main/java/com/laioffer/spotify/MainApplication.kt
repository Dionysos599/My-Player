package com.laioffer.spotify

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class MainApplication: Application() {

    @Inject
    override fun onCreate() {
        super.onCreate()
    }
}