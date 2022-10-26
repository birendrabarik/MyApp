package com.a.mvvm_dagger_retrofit_coroutine_get.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.a.mvvm_dagger_retrofit_coroutine_get.repository.ProductRepository
import javax.inject.Inject

class MainViewModelFactory @Inject constructor(private val reposistory:ProductRepository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewmodels(reposistory) as T
    }
}