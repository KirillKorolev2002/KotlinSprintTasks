package Lesson_17

fun main() {
    val package1 = Package("123456789")
    package1.currentLocation = "Склад"
    println(package1.getInfo())
    package1.currentLocation = "Отдел доставки"
    println(package1.getInfo())
}

class Package(val number: String) {
    private var _currentLocation: String = "У продавца"
    private var count: Int = 0
    var currentLocation: String
        get() = _currentLocation
        set(value) {
            _currentLocation = value
            count++
        }

    fun getInfo(): String {
        return "Посылка $number, Местоположение: $currentLocation, Перемещения: $count"
    }
}