package com.sem.daggersimple.presentation.di

import android.app.Application
import android.content.Context

class App : Application() {

    lateinit var appComponent2: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent2 = DaggerAppComponent.factory().create(applicationContext)
        //create()
    }

    open fun initializeComponent(): AppComponent {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Context in the graph
        return DaggerAppComponent.factory().create(applicationContext)
    }

}

/*
val Context.appComponent: AppComponent
    get() = when(this) {
        is App -> appComponent2
        else -> // (this.applicationContext as App).appComponent
            this.applicationContext.appComponent
    }*/
