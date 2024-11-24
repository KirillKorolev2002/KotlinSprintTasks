package Lesson_14

import java.lang.Math.pow

fun main() {
    val firstCircle = Circle(
        color = COLOR_BLACK,
        radius = readln().toDouble(),
    )
    val secondCircle = Circle(
        color = COLOR_WHITE,
        radius = readln().toDouble(),
    )
    val firstRectangle = Rectangle(
        color = COLOR_BLACK,
        weight = readln().toDouble(),
        height = readln().toDouble(),
    )
    val secondRectangle = Rectangle(
        color = COLOR_WHITE,
        weight = readln().toDouble(),
        height = readln().toDouble(),
    )
    val listOfCirclesAndRectangles = listOf(firstCircle, secondCircle, firstRectangle, secondRectangle)
    val blackPerimeter = listOfCirclesAndRectangles.filter { it.color == COLOR_BLACK }
    val sumOfBlackPerimeter = blackPerimeter.sumOf { it.perimeter() }
    println(sumOfBlackPerimeter)
    val whitePerimeter = listOfCirclesAndRectangles.filter { it.color == COLOR_WHITE }
    val sumOfWhitePerimeter = whitePerimeter.sumOf { it.area() }
    println(sumOfWhitePerimeter)
}

abstract class Figure(open val color: String) {
    abstract fun area(): Double
    abstract fun perimeter(): Double
}

open class Circle(override val color: String, val radius: Double) : Figure(color) {
    override fun area(): Double {
        val areaCircle = PI * pow(radius, 2.0)
        return areaCircle
    }

    override fun perimeter(): Double {
        val perimeterCircle = 2 * PI * radius
        return perimeterCircle
    }
}
open class Rectangle(override val color: String, val weight: Double, val height: Double) : Figure(color) {
    override fun area(): Double {
        val areaRectangle = weight * height
        return areaRectangle
    }

    override fun perimeter(): Double {
        val perimeterRectangle = 2 * (weight + height)
        return perimeterRectangle
    }
}

const val PI = 3.14
const val COLOR_BLACK = "Black"
const val COLOR_WHITE = "White"