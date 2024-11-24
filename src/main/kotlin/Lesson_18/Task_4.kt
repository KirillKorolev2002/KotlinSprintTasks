package Lesson_18

fun main() {
    val rectangularBox = RectangularBox("Посылка 1", 10.0, 5.0, 3.0)
    val cube = Cube("Посылка 2", 4.0)
    val boxes: List<Box> = listOf(rectangularBox, cube)
    for (box in boxes) {
        println(" ${box.name}${box.surfaceArea()}")
    }
}
abstract class Box(val name:String) {
    abstract fun surfaceArea(): Double
}

class RectangularBox(name: String, val length: Double, val width: Double, val height: Double) : Box(name) {
    override fun surfaceArea(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class Cube(name: String, val side: Double) : Box(name) {
    override fun surfaceArea(): Double {
        return 6 * side * side
    }
}