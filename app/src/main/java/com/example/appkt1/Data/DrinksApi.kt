package com.example.appkt1.Data

//******import data package here******
import com.example.appkt1.Drink
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DrinksApi {

    @GET("all")
    suspend fun getDrinks() : Response<List<Drink>>


    companion object{
        operator fun invoke() : DrinksApi {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://restcountries.eu/rest/v2/")
                .build()
                .create(DrinksApi::class.java)
        }
    }
}