package com.sem.daggersimple.presentation

import androidx.lifecycle.ViewModel
import com.sem.daggersimple.domain.StringUseCase

class StringViewModel(private val stringUseCase: StringUseCase) : ViewModel() {

    val getString = stringUseCase.getString()

}