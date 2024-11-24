package Lesson_5

fun main() {

    val winningNumbers= (0..42).random()
    val userNumbers = readln().toInt()
    val matches = winningNumbers

    if (matches == 3) {
        println("Вы угадали все числа и выиграли джекпот!")
    } else if (matches == 2) {
        println("Вы угадали два числа и получаете крупный приз!")
    } else if (matches == 1) {
        println("Вы угадали одно число и получаете утешительный приз.")
    } else {
        println("Вы не угадали ни одного числа.")
    }

    println("Выигрышные числа: $winningNumbers")
}