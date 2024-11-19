package com.movieflex

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MovieFlixApp : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("Application","Application Class Created")
    }
}