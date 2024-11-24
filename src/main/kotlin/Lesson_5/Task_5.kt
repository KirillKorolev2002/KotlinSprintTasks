package Lesson_5

fun main() {
    val theFirstNumber = readln().toInt()
    val theSecondNumber = readln().toInt()


    val theMathExampleForBot = theFirstNumber + theSecondNumber
    println("Чтобы доказать, что вы не бот, решите следующий пример:$theFirstNumber+$theSecondNumber")

    val theUserAnswer = readln().toInt()

    if (theUserAnswer == theMathExampleForBot) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}