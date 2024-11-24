package Lesson_19

fun main() {
    val myShip = Spaceship()
    myShip.fly()
    myShip.trajectory()
    myShip.dock()
}



class Spaceship() {
    fun fly() {
        // TODO:  Добавить здесь логику полета
    }
    fun dock() {
        TODO("Успешно приземлился")
    }
    fun trajectory() {
        NotImplementedError("Расчет траектории не реализован")
    }
}