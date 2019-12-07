package com.example.appkt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val repository = DrinksRepository(DrinksApi())

        GlobalScope.launch(Dispatchers.Main) {

            val drinks = repository.getDrinks()
            Toast.makeText(this@MainActivity,drinks.toString(),Toast.LENGTH_LONG).show()
        }

    }
}
