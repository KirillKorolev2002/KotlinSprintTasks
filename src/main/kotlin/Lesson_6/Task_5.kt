package Lesson_6

fun main() {
    var theTries = 3

    while (theTries > 0) {
        val theFirstInput = (1..9).random()
        val theSecondInput = (1..9).random()
        val theSumOfInputs = theFirstInput + theSecondInput

        println("Сколько будет $theFirstInput + $theSecondInput?")
        val theAnswer = readln().toInt()

        if (theAnswer == theSumOfInputs) {
            println("Добро пожаловать!")
            break
        } else {
            theTries--
            println("Неверно. Осталось попыток: $theTries")
        }
    }
    if (theTries == 0) {
        println("Доступ запрещен")
    }
}