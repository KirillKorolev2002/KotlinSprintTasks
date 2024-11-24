package Lesson_7

fun main() {
    val aRequest = readln().toInt()
    val theNumber = aRequest.toUInt()
    for (i in 0.toUInt() until theNumber) {
        if ((i % 2u) == 0.toUInt()) {
            print("$i\t")
        }
    }
}