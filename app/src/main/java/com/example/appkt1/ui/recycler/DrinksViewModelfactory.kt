package com.example.appkt1.ui.recycler

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.appkt1.Data.DrinksRepository

//import net.simplifiedcoding.data.repositories.MoviesRepository

@Suppress("UNCHECKED_CAST")
class DrinksViewModelfactory(
    private val repository: DrinksRepository
) : ViewModelProvider.NewInstanceFactory(){

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DrinksViewModel(repository) as T
    }

}