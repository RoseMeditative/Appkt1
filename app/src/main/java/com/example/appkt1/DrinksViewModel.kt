package com.example.appkt1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Job
/*import net.simplifiedcoding.util.Coroutines
import net.simplifiedcoding.data.models.Movie
import net.simplifiedcoding.data.repositories.MoviesRepository
*///IMPORT PACKAGES UTIL ET DATA


class DrinksViewModel(
    private val repository: DrinksRepository
) : ViewModel() {

    //private lateinit var job: Job

    private val _drinks = MutableLiveData<List<Drink>>()
    val drinks: LiveData<List<Drink>>
        get() = _drinks

    suspend fun getDrinks() {
        val drinks = repository.getDrinks()
        _drinks.value = drinks

    }
}
/*
    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}
*/