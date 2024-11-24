package Lesson_8

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    val theProduct = readln()
    for (contains in containsOfPizza) {
        if (contains == theProduct) {
            println("Ингредиент $theProduct в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}