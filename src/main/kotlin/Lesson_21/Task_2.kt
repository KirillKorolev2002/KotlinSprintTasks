package Lesson_21

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val sumOfEvenNumbers = numbers.evenNumbersSum()
    println("Сумма четных чисел: $sumOfEvenNumbers")
}

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}