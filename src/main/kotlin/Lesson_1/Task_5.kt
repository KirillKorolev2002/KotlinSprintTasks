package Lesson_1

fun main() {
    val seconds = 60
    val hour = 3600
    val minutes = 108
    val amountSeconds = seconds * minutes
    val amountHours = amountSeconds / hour
    val remainsSeconds = amountSeconds % hour
    val amountMinutes = remainsSeconds / seconds
    val remainsMinutes = remainsSeconds % seconds

    println("$amountHours:$amountMinutes:$remainsMinutes")
}