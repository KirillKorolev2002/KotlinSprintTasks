package Lesson_6

fun main() {
    var numberOfSeconds = readln().toInt()
    numberOfSeconds > 0
    numberOfSeconds--
    Thread.sleep(1000)
    println("Прошло $numberOfSeconds секунд")
}