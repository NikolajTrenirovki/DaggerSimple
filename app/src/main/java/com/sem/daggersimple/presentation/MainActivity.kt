package com.sem.daggersimple.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.sem.daggersimple.R
import com.sem.daggersimple.databinding.ActivityMainBinding
import com.sem.daggersimple.presentation.di.App
import com.sem.daggersimple.presentation.di.AppComponent
// import com.sem.daggersimple.presentation.di.appComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var stringViewModel: StringViewModel


    lateinit var app: AppComponent

   // val stringViewModel :StringViewModel by viewModels()

  //  val stringViewModel by viewModels<StringViewModel>()

    private var binding: ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {

        app = (application as App).appComponent
            .stringComponent().create()

       // appComponent.inject(this)
        app.inject(this)
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}