package com.example.pokemonsprint

data class Sprites (
    val front_default: String
)

data class ablity(
    val name: String
)

data class ablityList(
    val ablity: ablity
)

data class type(
    val name: String
)

data class typeList(
    val type: type
)


data class Pokemon (
    val name: String,
    val sprites: Sprites,
    val id: Int,
    val abilities: List<ablityList>,
    val types: List<typeList>
)