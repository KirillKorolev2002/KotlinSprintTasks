package Lesson_6

fun main() {
    val numberOfSeconds = readln().toInt()
    var counterNumberOfSeconds = numberOfSeconds
    while (counterNumberOfSeconds > 0){
        counterNumberOfSeconds--
        println("Осталось секунд:$counterNumberOfSeconds")
        Thread.sleep(1000)
    }
    println("Время вышло")
}