package Lesson_5

fun main() {

    println("Ввести первое число:")
    val userNumber1 = readln().toInt()
    println("Ввести второе число:")
    val userNumber2 = readln().toInt()

    if (userNumber1 == WINNING_NUMBER1 && WINNING_NUMBER2 == userNumber2 || userNumber1==WINNING_NUMBER2 && WINNING_NUMBER1 == userNumber2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (userNumber1 == WINNING_NUMBER1 && WINNING_NUMBER2 != userNumber2 || userNumber1 != WINNING_NUMBER1 && WINNING_NUMBER2 == userNumber2) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }

    println("Правильные числа для победы: $WINNING_NUMBER1 и $WINNING_NUMBER2")
}

const val WINNING_NUMBER1 = 8
const val WINNING_NUMBER2 = 8