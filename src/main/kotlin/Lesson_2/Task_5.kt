package Lesson_2

import kotlin.math.pow

fun main() {
    val currentCost = 70000
    val interestRate = 16.7
    val periodOfInvest = 20
    val futureCost = currentCost * (1 + interestRate / 100).pow(periodOfInvest)
    print(String.format("%.3f", futureCost))
}