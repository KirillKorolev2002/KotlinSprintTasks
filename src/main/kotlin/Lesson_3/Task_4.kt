package Lesson_3

fun main() {
    val theStepFrom = "E2"
    val theStepOn = "E4"
    val theNumberOfStep = 1

    val sentOnServer = "$theStepFrom-$theStepOn;$theNumberOfStep"

    println(sentOnServer)

    val theNewStepFrom = "D2"
    val theNewStepOn = "D3"
    val theNewNumberOfStep = 2

    val newSentOnServer = "$theNewStepFrom-$theNewStepOn;$theNewNumberOfStep"

    println(newSentOnServer)
}