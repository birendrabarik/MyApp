package com.a.mvvm_dagger_retrofit_coroutine_get.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.a.mvvm_dagger_retrofit_coroutine_get.model.Products
import com.a.mvvm_dagger_retrofit_coroutine_get.retrofit.FakerApi
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerApi: FakerApi) {

    private val _products = MutableLiveData<List<Products>>()
    val products: LiveData<List<Products>>
    get() = _products


    suspend fun getProducts(){
        val results = fakerApi.getProducts()
        if (results.isSuccessful && results.body() != null){
            _products.postValue(results.body())
        }

    }
}