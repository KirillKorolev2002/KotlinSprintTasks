package Lesson_18

fun main() {
    val screen = Screen()

    println(screen.drawCircle(10, 20))
    println(screen.drawCircle(10.5f, 20.7f))
    println(screen.drawSquare(5, 15))
    println(screen.drawSquare(5.2f, 15.8f))
    println(screen.drawPoint(0, 0))
    println(screen.drawPoint(1.1f, 2.2f))
}
class Screen {

    fun drawCircle(x: Int, y: Int): String = "Нарисован круг с координатами ($x, $y)"
    fun drawCircle(x: Float, y: Float): String = "Нарисован круг с координатами ($x, $y)"

    fun drawSquare(x: Int, y: Int): String = "Нарисован квадрат с координатами ($x, $y)"
    fun drawSquare(x: Float, y: Float): String = "Нарисован квадрат с координатами ($x, $y)"

    fun drawPoint(x: Int, y: Int): String = "Нарисована точка с координатами ($x, $y)"
    fun drawPoint(x: Float, y: Float): String = "Нарисована точка с координатами ($x, $y)"
}