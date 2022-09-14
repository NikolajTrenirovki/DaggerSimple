package com.sem.daggersimple.domain

class StringUseCase(private val stringCall: StringCall) {

    fun getString() : String {
        return stringCall.getString()
    }

}