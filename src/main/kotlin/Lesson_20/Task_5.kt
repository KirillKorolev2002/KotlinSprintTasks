package Lesson_20

import kotlin.random.Random

fun main() {
    val robot = Robot()

    println("Сообщение без модификатора:")
    robot.say()

    robot.setModifier { phrase ->
        phrase.split(" ").reversed().joinToString(" ")
    }

    println("\nСообщение с модификатором (инверсия слов):")
    robot.say()
}
class Robot {
    private var speechModifier: (String) -> String = { it }
    private val phrases = listOf(
        "Привет, мир!",
        "Как дела?",
        "Зарядка низкая!",
        "Выполняю задачу",
        "Система работает стабильно"
    )

    fun say() {
        val phrase = phrases[Random.nextInt(phrases.size)]
        println(speechModifier(phrase))
    }

    fun setModifier(modifier: (String) -> String) {
        speechModifier = modifier
    }
}