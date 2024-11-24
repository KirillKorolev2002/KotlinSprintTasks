package Lesson_21

fun main() {

    val text = readln()
    val count = text.vowelCount()
    println(count)
}

fun String.vowelCount(): Int {
    val vowels = "aeiouAEIOU"
    return this.count { it in vowels }
}