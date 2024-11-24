package Lesson_14

open class Liner(
    val name: String = "Лайнер",
    var speed: Double = 30.0,
    var passengerCapacity: Int = 2000
) {
    open fun displayInfo() {
        println("Корабль: $name, Скорость: $speed узлов, Вместимость: $passengerCapacity пассажиров")
    }
}

class CargoShip(
    name: String = "Грузовой корабль",
    speed: Double = 20.0,
    passengerCapacity: Int = 100
) : Liner(name, speed, passengerCapacity) {
    var cargoCapacity: Double = 5000.0

    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъемность: $cargoCapacity тонн")
    }
}

class Icebreaker(
    name: String = "Ледокол",
    speed: Double = 15.0,
    passengerCapacity: Int = 50
) : Liner(name, speed, passengerCapacity) {
    var canBreakIce: Boolean = true

    override fun displayInfo() {
        super.displayInfo()
        println("Способен колоть лёд: $canBreakIce")
    }
}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.displayInfo()
    println()
    cargoShip.displayInfo()
    println()
    icebreaker.displayInfo()
}
