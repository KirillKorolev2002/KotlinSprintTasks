package Lesson_12

fun main() {
    val dataOfATemperature = mutableListOf<WeatherInfo>()
    for (i in 1..DAY_IN_MONTHS) {
        val weatherInfo = WeatherInfo((273..300).random() - 273, (273..300).random(), true)
        dataOfATemperature.add(weatherInfo)
    }
    val dayTemperatures = dataOfATemperature.map { it.dayTemperature }
    val nightTemperatures = dataOfATemperature.map { it.nightTemperature }
    val daysWithPrecipitation = dataOfATemperature.map { it.hasPresenceOfPrecipitation }
    val averageDayTemperature = dayTemperatures.average()
    val averageNightTemperature = nightTemperatures.average()
    println("$averageDayTemperature")
    println("$averageNightTemperature")
    println("$daysWithPrecipitation")
}

private class WeatherInfo(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val hasPresenceOfPrecipitation: Boolean,
)

const val DAY_IN_MONTHS = 30