package com.example.appkt1

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class DrinksFragment : Fragment() {
/*
    companion object {
        fun newInstance() = DrinksFragment()
    }
*/
    private lateinit var viewModel: DrinksViewModel
    private lateinit var  factory: DrinksViewModelfactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.drinks_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val api= DrinksApi()
        val repository = DrinksRepository(api)

        factory = DrinksViewModelfactory(repository)
        viewModel = ViewModelProviders.of(this).get(DrinksViewModel::class.java)
        // TODO: Use the ViewModel


    }

}
