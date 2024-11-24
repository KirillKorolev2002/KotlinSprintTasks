package Lesson_12

fun main() {
    val weather1 = WeatherInfo(
        _dayTemperature = 298,
        _nightTemperature = 268,
        _presenceOfPrecipitation = "Да"
    )
    weather1.printDisplayInfo()
}

private class WeatherInfo(_dayTemperature: Int, _nightTemperature: Int, _presenceOfPrecipitation: String) {
    val dayTemperature: Int = _dayTemperature - 273
    val nightTemperature: Int = _nightTemperature - 273
    val presenceOfPrecipitation: String = _presenceOfPrecipitation

    init {
        printDisplayInfo()
    }
    fun printDisplayInfo() {
        println("Дневная температура: $dayTemperature°C, Ночная температура: $nightTemperature°C, Осадки: $presenceOfPrecipitation")
    }
}