package Lesson_3

fun main() {

    val sentOnServer = "D2-D4;0"

    val theDivideString = sentOnServer.split("-", ";")
    println(theDivideString)
    // Я не понял как обратиться к элементам строки, не как к массиву символов
    val fromPosition = theDivideString[0]
    val toPosition = theDivideString[1]
    val moveNumber = theDivideString[2]

    println("$fromPosition")
    println("$toPosition")
    println("$moveNumber")


}