package Lesson_15

fun main() {
    WeatherServerFactory.printAllInfo()
}

abstract class WeatherStationStats {
    abstract fun sendData(): Int
}

class Temperature : WeatherStationStats() {
    override fun sendData(): Int {
        return 30
    }
}

class PrecipitationAmount : WeatherStationStats() {
    override fun sendData(): Int {
        return 10
    }
}

object WeatherServerFactory {
    private val listOfData: MutableList<WeatherStationStats> = mutableListOf()

    private fun getData(weatherStationStatsType: String): WeatherStationStats {
        return when (weatherStationStatsType) {
            "Temperature" -> Temperature()
            "PrecipitationAmount" -> PrecipitationAmount()
            else -> throw IllegalArgumentException("Неизвестный тип метеоданных")
        }
    }

    fun printAllInfo() {
        try {
            val temperature = getData("Temperature")
            val precipitation = getData("PrecipitationAmount")
            listOfData.add(temperature)
            listOfData.add(precipitation)

            println("Все данные:")
            listOfData.forEach {
                println(it.sendData())
            }
        } catch (e: Exception) {
            println(e.message)
        }
    }
}