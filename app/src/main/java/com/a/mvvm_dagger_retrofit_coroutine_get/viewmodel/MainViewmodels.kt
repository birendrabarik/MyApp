package com.a.mvvm_dagger_retrofit_coroutine_get.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.a.mvvm_dagger_retrofit_coroutine_get.model.Products
import com.a.mvvm_dagger_retrofit_coroutine_get.repository.ProductRepository
import kotlinx.coroutines.launch

class MainViewmodels(private val repository: ProductRepository): ViewModel() {

    val productsLiveData : LiveData<List<Products>>
    get() = repository.products

    init {
        viewModelScope.launch {

        }
    }

}