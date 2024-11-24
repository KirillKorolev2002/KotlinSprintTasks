package Lesson_16

fun main() {
    val user = User("user123", "securePassword")
    val hasPasswordValid = user.validatePassword(readln())
    println(hasPasswordValid)
}

private class User(private val login: String, private val password: String) {
    fun validatePassword(inputPassword: String): Boolean {
        return password == inputPassword
    }
}