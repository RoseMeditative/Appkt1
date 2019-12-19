package com.example.appkt1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appkt1.Activity.MainActivity
import java.util.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val age = Timer()
        age.schedule(object:TimerTask(){
            override fun run(){

            val k=Intent(this@SplashActivity,MainActivity::class.java)
            startActivity(k)
        }
    },3000)

    }
}
