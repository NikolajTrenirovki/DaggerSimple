package com.sem.daggersimple.presentation

import androidx.lifecycle.ViewModel
import com.sem.daggersimple.domain.StringUseCase
import javax.inject.Inject

class StringViewModel @Inject constructor(private val stringUseCase: StringUseCase) : ViewModel() {

    val getString = stringUseCase.getString()

}