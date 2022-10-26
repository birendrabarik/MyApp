package com.a.mvvm_dagger_retrofit_coroutine_get.retrofit

import com.a.mvvm_dagger_retrofit_coroutine_get.model.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerApi {

    @GET("products")
    suspend fun getProducts(): Response<List<Products>>
}