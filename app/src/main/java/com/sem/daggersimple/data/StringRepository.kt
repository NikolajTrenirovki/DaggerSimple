package com.sem.daggersimple.data

import androidx.lifecycle.LiveData
import com.sem.daggersimple.domain.StringCall
import javax.inject.Inject

class StringRepository @Inject constructor() {

    override fun toString() : String = "какой-то текст"

}