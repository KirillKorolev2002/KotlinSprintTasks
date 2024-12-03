package Lesson_5

fun main() {
    val distance = readln().toDouble()
    val spendPer100km = readln().toDouble()
    val pricePerLiter = readln().toDouble()
    val totalFuel = (distance * spendPer100km) / 100
    val totalCost = totalFuel * pricePerLiter

    println("Общее количество необходимого топлива: $totalFuel")
    println("Итоговая стоимость поездки:${String.format("%.2f", totalCost)}")
}
