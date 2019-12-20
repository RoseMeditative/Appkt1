package com.example.appkt1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Drink (
    val name: String,
    val capital: String,
    val region : String,
    val latlng : Array<Double>,
    val subregion : String,
    val population : Int,
    val flag : String
)