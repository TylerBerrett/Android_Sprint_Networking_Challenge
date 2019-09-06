package com.example.pokemonsprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PokemonAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_about)


        val pokemon = intent.getSerializableExtra(MainActivity.POKEMON_INTENT_KEY) as PassPokemon
        println(pokemon.ability)

    }
}
