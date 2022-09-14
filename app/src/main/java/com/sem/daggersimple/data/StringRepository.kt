package com.sem.daggersimple.data

import com.sem.daggersimple.domain.StringCall

class StringRepository(private val str: String) : StringCall {

    override fun getString() : String {
        return str
    }

}