package com.example.appkt1.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appkt1.Data.DrinksApi
import com.example.appkt1.Data.DrinksRepository
import com.example.appkt1.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = DrinksRepository(DrinksApi())


    }
}
