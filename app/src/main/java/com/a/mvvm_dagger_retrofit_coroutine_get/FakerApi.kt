package com.a.mvvm_dagger_retrofit_coroutine_get

import android.app.Application
import com.a.mvvm_dagger_retrofit_coroutine_get.di.ApplicationComponent
import dagger.internal.DaggerCollections

class FakerApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApp.builder().build()
    }
}