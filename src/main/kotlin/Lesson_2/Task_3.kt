package Lesson_2

fun main() {
    val timeOfHoursOfDeparture = 9
    val timeOfMinutesOfDeparture = 39
    val timeOfWay = 457
    val hoursinMinutes=60
    val timeInWholeHours = timeOfWay / hoursinMinutes
    val timeInWholeMinutes = timeInWholeHours * hoursinMinutes
    val remainingTimeInMinutes = timeOfWay - timeInWholeMinutes
    val timeOfArrivalInHours = timeOfHoursOfDeparture + timeInWholeHours
    val timeOfArrivalInRemainingHours = (timeOfMinutesOfDeparture + remainingTimeInMinutes) / hoursinMinutes
    val timeOfArrivalInMinutes = timeOfArrivalInRemainingHours * hoursinMinutes
    val timeOfArrivalInRemainingMinutes = (timeOfMinutesOfDeparture + remainingTimeInMinutes) - timeOfArrivalInMinutes
    val timeOfArrivalInHoursFinal = timeOfArrivalInHours + timeOfArrivalInRemainingHours
    println(String.format("%d:%d",timeOfArrivalInHoursFinal,timeOfArrivalInRemainingMinutes))
}