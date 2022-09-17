package com.sem.daggersimple.presentation.di

import com.sem.daggersimple.presentation.MainActivity
import com.sem.daggersimple.presentation.StringFragment
import com.sem.daggersimple.presentation.StringViewModelFactory
import dagger.Component
import dagger.Subcomponent

@Component(modules = [AppModule::class])
interface AppComponent {

    //fun viewModelsFactory(): StringViewModelFactory

    @Subcomponent.Factory
    interface Factory {
        fun create(): AppComponent
    }

    fun stringComponent(): Factory

    fun inject(mainActivity: MainActivity)
    fun inject(stringFragment: StringFragment)

}