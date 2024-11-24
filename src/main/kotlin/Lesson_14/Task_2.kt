package Lesson_14

open class PassengerLiner(
    val name: String = "Пассажирский лайнер",
    var speed: Double = 30.0,
    var passengerCapacity: Int = 2000
) {
    open fun displayInfo() {
        println("Корабль: $name, Скорость: $speed узлов, Вместимость: $passengerCapacity пассажиров")
    }

    open fun load() {
        println("$name выдвигает горизонтальный трап со шкафута.")
    }
}

class FreightShip(
    name: String = "Грузовой корабль",
    speed: Double = 20.0,
    passengerCapacity: Int = 100
) : PassengerLiner(name, speed, passengerCapacity) {
    var cargoCapacity: Double = 5000.0

    override fun displayInfo() {
        super.displayInfo()
        println("Грузоподъемность: $cargoCapacity тонн")
    }

    override fun load() {
        println("$name активирует погрузочный кран.")
    }
}

class IcebreakerShip(
    name: String = "Ледокол",
    speed: Double = 15.0,
    passengerCapacity: Int = 50
) : PassengerLiner(name, speed, passengerCapacity) {
    var canBreakIce: Boolean = true

    override fun displayInfo() {
        super.displayInfo()
        println("Способен колоть лёд: $canBreakIce")
    }

    override fun load() {
        println("$name открывает ворота со стороны кормы.")
    }
}

fun main() {
    val passengerLiner = PassengerLiner()
    val freightShip = FreightShip()
    val icebreakerShip = IcebreakerShip()

    passengerLiner.displayInfo()
    passengerLiner.load()
    println()

    freightShip.displayInfo()
    freightShip.load()
    println()

    icebreakerShip.displayInfo()
    icebreakerShip.load()
}
