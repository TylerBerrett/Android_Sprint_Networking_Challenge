package com.example.pokemonsprint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_pokemon_about.*

class PokemonAbout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokemon_about)


        val pokemon = intent.getSerializableExtra(MainActivity.POKEMON_INTENT_KEY) as PassPokemon

        val type = pokemon.type.toString().replace("[", "").replace("]", "")
        val ability = pokemon.ability.toString().replace("[", "").replace("]", "")

        Picasso.get().load(pokemon.sprites).into(about_pokemon_image)
        about_pokemon_name.text =    "Name: ${pokemon.name}"
        about_pokemon_id.text =      "Pokedex Location: ${pokemon.id}"
        about_pokemon_ability.text = "Abilities: $ability"
        about_pokemon_type.text =    "Type(s): $type"

    }
}
