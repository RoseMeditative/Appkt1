package com.example.appkt1.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.appkt1.Drink
import com.example.appkt1.R

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent = intent
        val title = intent.getStringExtra("title")
        val capital = intent.getStringExtra("capital")
        val region = intent.getStringExtra("region")
        val subregion = intent.getStringExtra("subregion")
        val population = intent.getStringExtra("population")
        val lat = intent.getDoubleExtra("lat",0.0)
        val lng = intent.getDoubleExtra("lng",0.0)

        val mapBtn = findViewById<Button>(R.id.button)


        val resultat1 = findViewById<TextView>(R.id.countryText)
        resultat1.text= title

        val resultat2 = findViewById<TextView>(R.id.CapitalText)
        resultat2.text= capital

        val resultat3 = findViewById<TextView>(R.id.RegionText)
        resultat3.text= region

        val resultat4 = findViewById<TextView>(R.id.SubregionText)
        resultat4.text= subregion

        val resultat5 = findViewById<TextView>(R.id.PopText)
        resultat5.text= population


        mapBtn.setOnClickListener{


            val intent = Intent (this@SecondActivity,MapsActivity::class.java)

            intent.putExtra("lat",lat)
            intent.putExtra("lng",lng)

            startActivity(intent)

        }




    }

/*
    override fun onRecyclerViewItemClick(view: View, drink: Drink) {
        when(view.id){
            //GESTION DES BOUTONS


            R.id.button -> {
                //AFFICHER LES DETAILS
                val intent = Intent(this, MapsActivity::class.java)

                intent.putExtra("lat",drink.latlng[0])
                intent.putExtra("long",drink.latlng[1])


                startActivity(intent)
                Toast.makeText(requireContext()," Recherche d'informations ... ", Toast.LENGTH_LONG).show()
            }
            //
            //    Toast.makeText(requireContext(), "Like Layout Clicked",Toast.LENGTH_LONG).show()
            //}




        }
    }
*/
}
