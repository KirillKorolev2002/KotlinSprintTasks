package Lesson_21

import java.io.File

fun main() {
    val file = File("words.txt")
    file.addWord("Hello")
    file.addWord("World")
    println(file.readText())
}

fun File.addWord(word: String) {
    val textToWrite = word.lowercase()
    writer().write(textToWrite)
    val content = readText()
    writeText(content.reversed())
}