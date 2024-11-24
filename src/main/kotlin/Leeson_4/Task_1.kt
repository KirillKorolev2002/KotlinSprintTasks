package Leeson_4

fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    val isAvailableToday = reservedTablesToday < ALL_NUMBER_OF_TABLES
    val isAvailableTomorrow = reservedTablesTomorrow < ALL_NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $isAvailableToday")
    println("Доступность столиков на завтра: $isAvailableTomorrow")
}
const val ALL_NUMBER_OF_TABLES: Int = 13