package com.example.appkt1.ui.recycler

import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import android.widget.SearchView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appkt1.*
import com.example.appkt1.Activity.SecondActivity
import com.example.appkt1.Drink
import com.example.appkt1.Data.DrinksApi
import com.example.appkt1.Data.DrinksRepository
import kotlinx.android.synthetic.main.drinks_fragment.*


class DrinksFragment : Fragment() , RecyclerViewClickListener {

    companion object {
        fun newInstance() = DrinksFragment()
    }

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
        viewModel = ViewModelProviders.of(this,factory
        ).get(DrinksViewModel::class.java)

        viewModel.getDrinks()

        viewModel.drinks.observe(viewLifecycleOwner, Observer { drinks ->
            recycler_view_drinks.also {
                it.layoutManager = LinearLayoutManager(requireContext())
                it.setHasFixedSize(true)
                it.adapter = DrinksAdapter(drinks, this)
            }
        })


    }


    override fun onRecyclerViewItemClick(view: View, drink: Drink) {
        when(view.id){
            //GESTION DES BOUTONS


            R.id.button_book -> {
                //AFFICHER LES DETAILS
                val intent = Intent(activity, SecondActivity::class.java)
                //val one = String()
                intent.putExtra("title",drink.name)
                intent.putExtra("capital",drink.capital)
                intent.putExtra("region",drink.region)
                intent.putExtra("subregion",drink.subregion)
                intent.putExtra("population",drink.population)




                intent.putExtra("lat",drink.latlng[0])
                intent.putExtra("long",drink.latlng[1])


                        startActivity(intent)
               Toast.makeText(requireContext()," Recherche d'informations ... ",Toast.LENGTH_LONG).show()
            }
          //  R.id.layout_like ->{
            //    Toast.makeText(requireContext(), "Like Layout Clicked",Toast.LENGTH_LONG).show()
            //}




        }
    }


}
