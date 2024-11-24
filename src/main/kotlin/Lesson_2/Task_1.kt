package Lesson_2

fun main() {

    val numberOfPupils = 4
    val firstPupilMark = 3
    val secondPupilMark = 4
    val thirdPupilMark = 3
    val fourthPupilMark = 5

    val summOfMarks = (firstPupilMark + secondPupilMark + thirdPupilMark + fourthPupilMark).toFloat()
    val averageSummOfMarks = (summOfMarks / numberOfPupils)

    println(averageSummOfMarks)
}