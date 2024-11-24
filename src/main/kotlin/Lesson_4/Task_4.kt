package Lesson_4

fun main() {
    val day = readln().toInt()

    val isEven = day % 2 == 0

    println(
        """
        Упражнения для рук:       ${!isEven}
        Упражнения для ног:       ${isEven}
        Упражнения для спины:     ${isEven}
        Упражнения для пресса:    ${!isEven}
    """.trimIndent()
    )
}