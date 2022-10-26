package com.a.mvvm_dagger_retrofit_coroutine_get.di

import com.a.mvvm_dagger_retrofit_coroutine_get.retrofit.FakerApi
import com.a.mvvm_dagger_retrofit_coroutine_get.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    fun provideRetrofit():Retrofit {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun providerFakerApi(retrofit: Retrofit):FakerApi{
        return retrofit.create(FakerApi::class.java)
    }
}