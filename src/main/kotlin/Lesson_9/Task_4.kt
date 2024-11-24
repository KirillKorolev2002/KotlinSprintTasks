package Lesson_9

fun main() {
    println("Введите 5 ингредиентов:")

    val input = readln()

    val ingredientsList = input.split(", ").sorted()

    ingredientsList.forEach { println(it) }
}