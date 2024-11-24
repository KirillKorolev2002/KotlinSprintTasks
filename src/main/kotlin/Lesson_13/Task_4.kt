package Lesson_13

import kotlin.random.Random

fun main() {
    val planet = Planet(
        hasAtmosphere = Random.nextBoolean(),
        hasToBeLanded = Random.nextBoolean(),
        nameOfPlanet = generateRandomString((1..20).random()),
    )
    repeat(2) {
        val satellite = Satellite(
            hasAtmosphere = Random.nextBoolean(),
            hasToBeLanded = Random.nextBoolean(),
            nameOfSatellite = generateRandomString((1..20).random()),
        )
        planet.theListOfSatellites.add(satellite)
    }
    println("Имя планеты: ${planet.nameOfPlanet}")
    planet.theListOfSatellites.forEach { it -> println("Имя спутника: ${it.nameOfSatellite}") }

}

fun generateRandomString(length: Int): String {
    val chars = ('a'..'z') + ('A'..'Z') + ('0'..'9') // Разрешенные символы
    return (1..length).map { chars.random() }.joinToString("")
}

abstract class CelestialBody {
    abstract val hasAtmosphere: Boolean
    abstract val hasToBeLanded: Boolean
}

open class Planet(
    override val hasAtmosphere: Boolean,
    override val hasToBeLanded: Boolean,
    val nameOfPlanet: String,
) : CelestialBody() {
    val theListOfSatellites: MutableList<Satellite> = mutableListOf()
}

class Satellite(
    override val hasAtmosphere: Boolean,
    override val hasToBeLanded: Boolean,
    val nameOfSatellite: String,
) : CelestialBody()