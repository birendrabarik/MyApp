package com.a.mvvm_dagger_retrofit_coroutine_get.di

import com.a.mvvm_dagger_retrofit_coroutine_get.MainActivity
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
}