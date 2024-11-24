package Lesson_12

fun main() {
    val weather1 = NewWeatherData(
        _dayTemperature = 25,
        _nightTemperature = -5,
        _presenceOfPrecipitation = "Да",
    )
    weather1.printDisplayInfo()
}
private class NewWeatherData(_dayTemperature: Int, _nightTemperature: Int, _presenceOfPrecipitation: String) {
    var dayTemperature: Int = _dayTemperature
    var nightTemperature: Int = _nightTemperature
    var presenceOfPrecipitation: String = _presenceOfPrecipitation

    fun printDisplayInfo() {
        println("$dayTemperature,$nightTemperature,$presenceOfPrecipitation")
    }
}