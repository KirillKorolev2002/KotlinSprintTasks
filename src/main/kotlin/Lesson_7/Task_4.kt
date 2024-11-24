package Lesson_7

fun main() {
    val timeToFreeze = readln().toInt()
    for (i in 0..timeToFreeze) {
        println("Прошло секунд:$i")
        println("Осталось секунд:${timeToFreeze - i}")
        if (i == timeToFreeze) {
            println("Время вышло")
        }
    }
}