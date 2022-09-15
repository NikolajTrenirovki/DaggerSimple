package com.sem.daggersimple.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sem.daggersimple.R
import com.sem.daggersimple.databinding.ActivityMainBinding
import com.sem.daggersimple.presentation.di.App
//import com.sem.daggersimple.presentation.di.appComponent

class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // appComponent.inject(this)
       // (this.applicationContext as App).appComponent2.inject(this)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}