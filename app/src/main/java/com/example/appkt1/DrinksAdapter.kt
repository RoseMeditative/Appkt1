package com.example.appkt1



import android.view.LayoutInflater
import android.view.Menu
import android.view.ViewGroup
import android.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.appkt1.databinding.RecyclerviewDrinkBinding
import com.example.appkt1.ui.recycler.RecyclerViewClickListener






class DrinksAdapter (
    private val drinks: List<Drink>,
    private val listener: RecyclerViewClickListener
) : RecyclerView.Adapter<DrinksAdapter.DrinksViewHolder>(){

    override fun getItemCount() = drinks.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DrinksViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.recyclerview_drink,
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: DrinksViewHolder, position: Int) {
        holder.recyclerviewDrinkBinding.drink = drinks[position]
        holder.recyclerviewDrinkBinding.buttonBook.setOnClickListener {
            listener.onRecyclerViewItemClick(holder.recyclerviewDrinkBinding.buttonBook, drinks[position])
        }
        /*holder.recyclerviewDrinkBinding.layoutLike.setOnClickListener {
            listener.onRecyclerViewItemClick(holder.recyclerviewDrinkBinding.layoutLike, drinks[position])
        }*/
    }



    inner class DrinksViewHolder(
        val recyclerviewDrinkBinding: RecyclerviewDrinkBinding
    ) : RecyclerView.ViewHolder(recyclerviewDrinkBinding.root)

}
