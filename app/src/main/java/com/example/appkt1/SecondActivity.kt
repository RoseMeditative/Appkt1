package com.example.appkt1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

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
