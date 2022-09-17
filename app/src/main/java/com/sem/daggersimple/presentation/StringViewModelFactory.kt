package com.sem.daggersimple.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
//import java.security.Provider
import javax.inject.Inject
import javax.inject.Provider

class StringViewModelFactory @Inject constructor(
    stringViewModelProvider: Provider<StringViewModel>
) : ViewModelProvider.Factory {

    private val providers = mapOf<Class<*>, Provider<out ViewModel>>(
        StringViewModel::class.java to stringViewModelProvider
    )

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return providers[modelClass]!!.get() as T
    }

}