package Lesson_22

data class Book(val title: String, val author: String, val year: Int)

fun main() {
    val book = Book("1", "2", 2024)
    val (title, author, year) = book
    println(title)
    println(author)
    println(year)
}