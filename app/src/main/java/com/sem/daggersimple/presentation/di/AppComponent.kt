package com.sem.daggersimple.presentation.di

import com.sem.daggersimple.presentation.MainActivity
import com.sem.daggersimple.presentation.StringFragment
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(stringFragment: StringFragment)

}