package com.example.appkt1

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

data class Drink (
    val name: String,
    val capital: String,
    val region : String,
    /*val subregion : String,
    val population : String,*/
    val flag : String
)