package com.example.appkt1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Drink (
    val id: Int,
    val image: String,
    val is_new: Int,
    val language: String,
    val like_percent: Int,
    val rating: String,
    val title: String,
    val type: String,
    val vote_count: Int
)