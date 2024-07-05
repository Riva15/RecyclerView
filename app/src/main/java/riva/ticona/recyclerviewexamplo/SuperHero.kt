package riva.ticona.recyclerviewexamplo

data class SuperHero(
    val superhero: String,
    val publisher: String,
    val realName: String,
    val photo: String,
    val description: String? = null  // Nueva propiedad, opcional
)
