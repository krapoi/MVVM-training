package com.example.mvvmtrainning.View

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.mvvmtrainning.R
import com.example.mvvmtrainning.viewModel.MainViewModel
import com.example.mvvmtrainning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mbinding : ActivityMainBinding
    private val model : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        mbinding.lifecycleOwner = this
        mbinding.viewModel = model

    }
}