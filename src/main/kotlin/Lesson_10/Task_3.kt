package Lesson_10

fun main() {
    val length = readln().toInt()
    println(createPassword(length))
}
fun createPassword(length:Int): String {
    var thePassword = StringBuilder()
    for (counter in 1..length)
        if (counter % 2 != 0) {
            val theNumberOfNumerals = (1..9).random()
            thePassword = thePassword.append(theNumberOfNumerals)
        } else {
            val theNumberOfSymbols = ('!'..'/').random()
            thePassword = thePassword.append(theNumberOfSymbols)
        }
    return thePassword.toString()
}