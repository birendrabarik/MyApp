package com.a.mvvm_dagger_retrofit_coroutine_get.model

data class Products(
    val category: String,
    val description: String,
    val id: Int,
    val image: String,
    val price: Double,
    val title: String
)