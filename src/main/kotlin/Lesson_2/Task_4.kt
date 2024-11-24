package Lesson_2

fun main() {

    val cristalOre = 7
    val ironOre = 11
    val baffPercentages = 20
    val transferToPercentages = 100

    val baffCristalOre = (cristalOre * (baffPercentages / transferToPercentages))
    val baffIronOre = (ironOre * (baffPercentages / transferToPercentages))

    println(baffCristalOre)
    println(baffIronOre)
}