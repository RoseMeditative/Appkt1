package com.example.appkt1.ui.recycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.appkt1.util.Coroutines
import com.example.appkt1.Drink
import com.example.appkt1.Data.DrinksRepository
import kotlinx.coroutines.Job



class DrinksViewModel(
    private val repository: DrinksRepository
) : ViewModel() {

    private lateinit var job: Job

    private val _drinks = MutableLiveData<List<Drink>>()
    val drinks: LiveData<List<Drink>>
        get() = _drinks

    fun getDrinks() {
        job = Coroutines.ioThenMain({ repository.getDrinks() },
            { _drinks.value = it }
        )


    }


    override fun onCleared() {
        super.onCleared()
        if(::job.isInitialized) job.cancel()
    }
}
