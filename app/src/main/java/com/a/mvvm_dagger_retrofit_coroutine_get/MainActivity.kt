package com.a.mvvm_dagger_retrofit_coroutine_get

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.a.mvvm_dagger_retrofit_coroutine_get.viewmodel.MainViewModelFactory
import com.a.mvvm_dagger_retrofit_coroutine_get.viewmodel.MainViewmodels
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var mainViewmodels: MainViewmodels
    private val products: TextView
    get() = findViewById(R.id.products)

    @Inject
    lateinit var mainViewModelFactory: MainViewModelFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        (application as  FakerApplication).applicationComponent.inject(this)
        mainViewmodels = ViewModelProvider(this,mainViewModelFactory).get(MainViewmodels::class.java)
        mainViewmodels.productsLiveData.observe(this,{
            it.joinToString { x -> x.title + "\n\n" }
        })
    }
}