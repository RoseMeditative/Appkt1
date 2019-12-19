package com.example.appkt1.ui.recycler

import android.view.View
import com.example.appkt1.Drink


interface RecyclerViewClickListener {
    fun onRecyclerViewItemClick(view: View, movie: Drink)
}
