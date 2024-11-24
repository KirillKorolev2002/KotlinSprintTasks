package Lesson_8

fun main() {
    val viewsPerDay = arrayOf(150, 200, 180, 220, 170, 190, 100)
    for (i in 0..viewsPerDay.lastIndex) {
        val random = (1..1000).random()
        viewsPerDay[i] = random
    }
    val totalViews = viewsPerDay.sum()
    println("Общее количество просмотров за неделю: $totalViews")

}