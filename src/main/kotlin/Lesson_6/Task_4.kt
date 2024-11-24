package Lesson_6

fun main() {
    val theNumberInRange = (1..9).random()
    var countOfTriesUsers = COUNT_OF_TRIES

    do {
        val resultOfNumber = theNumberInRange
        val triesOfUser = readln().toInt()
        countOfTriesUsers--
        println("Неверно")
        println("Осталось попыток:$countOfTriesUsers")
    } while (countOfTriesUsers > 0 && triesOfUser != resultOfNumber )

    println("Было отгадано число $theNumberInRange")
}

const val COUNT_OF_TRIES = 5