package Lesson_4

fun main() {
    val isWeatherTodayAllowed: Boolean = IS_WEATHER_SUNNY

    val isTentTodayAllowed: Boolean = IS_AWNING_OPEN

    val airHumidity = readln().toInt()
    val currentSeason = readln()
    val conditions =
        isWeatherTodayAllowed && isTentTodayAllowed && airHumidity == AIR_HUMIDITY_TODAY && currentSeason != CURRENT_SEASON_TODAY

    println("Благоприятные ли условия сейчас для роста бобовых? $conditions")
}

const val AIR_HUMIDITY_TODAY = 20
const val IS_WEATHER_SUNNY = true
const val IS_AWNING_OPEN = true
const val CURRENT_SEASON_TODAY = "Зима"