package Lesson_22

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)

fun main() {
    val regularBook1 = RegularBook("Капитанская дочка", "Лев Толстой")
    val regularBook2 = RegularBook("Капитанская дочка", "Лев Толстой")

    val dataBook1 = DataBook("Капитанская дочка", "Лев Толстой")
    val dataBook2 = DataBook("Капитанская дочка", "Лев Толстой")

    val regularBooks = regularBook1.equals(regularBook2)
    println(regularBooks)

    val dataBooks = dataBook1.equals(dataBook2)
    println(dataBooks)
}
/*
Ну видимо в data Class сравнивается содержимое, а в обычном классе по параметру
 */