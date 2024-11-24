package Lesson_9

fun main() {
    val theList = listOf(2, 50, 15)
    val number = readln().toInt()
    val theNumberOfList = theList.map { it * number }

    println("На $number вам понадобится: Яиц – ${theNumberOfList[0]}, молока – ${theNumberOfList[1]}, сливочного масла – ${theNumberOfList[2]}")
}