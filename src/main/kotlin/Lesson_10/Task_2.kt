package Lesson_10

fun main() {
    val login = readln()
    val password = readln()
    if (ValidationOfLength(login) && ValidationOfLength(password)) {
        println("Войдешь!")
    } else {
        println("Не войдешь!")
    }
}

fun ValidationOfLength(allowed: String): Boolean {
    return allowed.length >= MAХIMUM_LENGTH
}

const val MAХIMUM_LENGTH = 4