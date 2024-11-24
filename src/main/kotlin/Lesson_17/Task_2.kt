package Lesson_17

fun main() {
    val myShip = Ship("Корабль", 25.0, "Архангельск")
    println(myShip)
    myShip.name = "Корабль2"
    println(myShip)
}

private class Ship(private var _name: String, var averageSpeed: Double, var homePort: String) {
    var name: String = _name
        set(value) = println("Имя корабля нельзя изменить!")

}