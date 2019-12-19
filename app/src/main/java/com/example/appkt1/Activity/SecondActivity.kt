package com.example.appkt1.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.appkt1.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

     var intent = intent
        val title = intent.getStringExtra("title")
        val resultat = findViewById<TextView>(R.id.textView)
        resultat.text= title
    }
}
