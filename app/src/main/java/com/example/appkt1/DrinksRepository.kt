package com.example.appkt1

//***import package data/network****

class DrinksRepository(
    private val api: DrinksApi
) : SafeApiRequest() {

    suspend fun getDrinks() = apiRequest { api.getDrinks() }

}