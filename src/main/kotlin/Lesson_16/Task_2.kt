package Lesson_16

class Circle(private val radius: Int) {
    private companion object {
        const val PI = 3.14
    }

    fun circumference(): Double {
        return 2 * PI * radius
    }

    fun area(): Double {
        return PI * radius * radius
    }
}

fun main() {
    val radius = readln().toInt()
    val circle = Circle(radius)
    println(circle.circumference())
    println(circle.area())
}