package com.example.appkt1.util

import android.widget.ImageView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.github.twocoffeesoneteam.glidetovectoryou.*


@BindingAdapter("flag")
fun loadImage(view: ImageView, url: String) {


    Glide.with(view)
        .load(url)
        .into(view)

}