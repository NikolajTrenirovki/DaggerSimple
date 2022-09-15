package com.sem.daggersimple.presentation.di

import android.content.Context
import com.sem.daggersimple.presentation.MainActivity
import com.sem.daggersimple.presentation.StringFragment
import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    // Factory to create instances of the AppComponent
    @Component.Factory
    interface Factory {
        // With @BindsInstance, the Context passed in will be available in the graph
        fun create(@BindsInstance context: Context): AppComponent
    }

    fun inject(mainActivity: MainActivity)
    fun inject(stringFragment: StringFragment)

}