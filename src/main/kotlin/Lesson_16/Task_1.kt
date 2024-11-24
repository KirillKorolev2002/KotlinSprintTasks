package Lesson_16

fun main() {
    val randomOfCube = RandomOfCube()
    println(randomOfCube.displayInfo())
}

private class RandomOfCube {
    private val randomOfCount = (1..6).random()
    fun displayInfo() = randomOfCount
}