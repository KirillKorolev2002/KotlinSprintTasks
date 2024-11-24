package Lesson_4

fun main() {

    val isDamagesToday = IS_NOT_DAMAGED

    val crewCount = readln().toInt()
    val crewCountCanBeOnTheShip = (THE_MINIMUM_OF_CREW <= crewCount) and (crewCount <= THE_MAXIMUM_OF_CREW)

    val provisionBoxes = readln().toInt()

    val isWeatherOnBoat = IS_GOOD_WEATHER

    val theSail = (isDamagesToday && crewCountCanBeOnTheShip && provisionBoxes > THE_MINIMUM_OF_PROVISION) ||
            (crewCount <= THE_MINIMUM_OF_CREW && isWeatherOnBoat && provisionBoxes >= THE_MINIMUM_OF_PROVISION)

    println(theSail)
}

const val THE_MINIMUM_OF_CREW = 55
const val THE_MAXIMUM_OF_CREW = 70
const val THE_MINIMUM_OF_PROVISION = 50
const val IS_NOT_DAMAGED = true
const val IS_GOOD_WEATHER = true