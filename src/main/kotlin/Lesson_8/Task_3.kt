package Lesson_8

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    val theProduct = readln()
    if (theProduct in containsOfPizza) {
        println("В рецепте есть $theProduct")
    } else {
        println("В рецепте нет")
    }
}