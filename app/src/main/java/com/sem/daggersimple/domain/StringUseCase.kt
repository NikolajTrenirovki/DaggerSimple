package com.sem.daggersimple.domain

import androidx.lifecycle.LiveData
import com.sem.daggersimple.data.StringRepository
import javax.inject.Inject

class StringUseCase @Inject constructor(private val repository: StringRepository) {

    fun getString() : String {
        return repository.toString()
    }

}