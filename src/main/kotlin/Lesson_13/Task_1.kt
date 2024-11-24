package Lesson_13

fun main() {
    val user = Handbook(
        name = "Кирилл Королев",
        numberOfPhone = 89200188827,
        company = null,
    )
    user.displayInfo()
}

class Handbook(
    val name: String,
    val numberOfPhone: Long,
    var company: String?,
) {
    fun displayInfo() {
        println("$name,$numberOfPhone,$company")
    }
}