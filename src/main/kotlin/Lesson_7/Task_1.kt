package Lesson_7

fun main() {
    val charRangeForPassword: CharRange = 'a'..'z'
    val intRangeForPassword: IntRange = 0..9
    val thePassword = StringBuilder()
    for (i in 1 until 6) {
        if (i % 2 == 0) {
            val randomWords = charRangeForPassword.random()
            thePassword.append(randomWords) //метод из CHAT GPT взял,по другому не получается сложить
        } else {
            val randomNumbers = intRangeForPassword.random()
            thePassword.append(randomNumbers)
        }
    }
    println(thePassword)
}