package Lesson_12

fun main() {
    val weather1 = WeatherData()
    weather1.dayTemperature = 30
    weather1.nightTemperature = 15
    weather1.presenceOfPrecipitation = "Нет"

    val weather2 = WeatherData()
    weather2.dayTemperature = 20
    weather2.nightTemperature = 5
    weather2.presenceOfPrecipitation = "Есть"

    weather1.printDisplayInfo()
    weather2.printDisplayInfo()
}

private class WeatherData(
    var dayTemperature: Int = 25,
    var nightTemperature: Int = -5,
    var presenceOfPrecipitation: String = "Отсутствует"
) {
    fun printDisplayInfo() {
        println("$dayTemperature,$nightTemperature,$presenceOfPrecipitation")
    }
}