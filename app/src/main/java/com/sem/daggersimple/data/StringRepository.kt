package com.sem.daggersimple.data

import com.sem.daggersimple.domain.StringCall
import javax.inject.Inject

class StringRepository @Inject constructor() {

    override fun toString() = "какой-то текст"

}