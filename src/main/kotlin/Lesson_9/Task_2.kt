package Lesson_9

fun main() {

    val theList = mutableListOf("Тесто", "Ананас", "Колбаса")
    println("В рецепте есть базовые ингредиенты: $theList")
    println("Желаете добавить еще? Да или нет?")


    if (readln().equals("Да", ignoreCase = true)) {
        println("Какой ингредиент вы хотите добавить?")
        theList.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты: $theList")
    } else {
        println("Завершаю работу")
    }
}