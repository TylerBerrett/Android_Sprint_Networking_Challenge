package com.example.pokemonsprint

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object PokemonObject {
    private const val BASE_URL = "https://pokeapi.co/api/v2/pokemon/"

    val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    fun getPokemon(): Call<Pokemon>{
        return retrofit.create(PokemonGetApi::class.java).getPokemonByNameOrID(MainActivity.PokemonNameNumber)
    }
}