package Lesson_8

fun main() {
    println("Введите количество ингредиентов:")
    val ingredients = Array(readln().toInt()) { readln() }

    println("Введенные ингредиенты: ${ingredients.joinToString(", ")}")
}