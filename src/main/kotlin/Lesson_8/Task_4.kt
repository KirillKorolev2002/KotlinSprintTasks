package Lesson_8

fun main() {
    val containsOfPizza = arrayOf("Ананас", "Колбаса", "Сыр", "Тесто", "Соус", "Специи")
    println("$containsOfPizza")
    val theInformationAboutIngredient = readln()

    val index = containsOfPizza.indexOf(theInformationAboutIngredient)

    if (index != -1) {
        if ( index  in containsOfPizza.indices) {
            val theChangeTheElement = readln()
            containsOfPizza[index] = theChangeTheElement
            println("Готово! Вы сохранили следующий список: ${containsOfPizza.contentToString()}")
        } else {
            println("Неверный номер ингредиента.")
        }
    }
}