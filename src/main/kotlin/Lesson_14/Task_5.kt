package Lesson_14

fun main () {
    val numberInput = readln()
    val numberOfPhone: Long? = try {
        numberInput.toLongOrNull()
    } catch (e: Exception) {
        null
    }
    if (numberOfPhone != null) {
        val phoneBookEntry1 = PhoneBookEntry1("", numberOfPhone)
    } else {
        println("Invalid phone number")
    }
}
class PhoneBookEntry1(
    val name: String,
    val numberOfPhone: Long,
    var company: String? = null,
) {
}