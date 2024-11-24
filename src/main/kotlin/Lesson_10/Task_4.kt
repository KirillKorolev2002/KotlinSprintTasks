package Lesson_10

fun main() {
    champion()
    toRepeatGame()
}

fun aRollOfTheDice1(): Int = (1..6).random()
fun usersRoll1(): Int {
    println("Бросает игрок")
    val usersTurn = aRollOfTheDice()
    val theResultOfUsersTurn = usersTurn
    println("Выпало у игрока:$theResultOfUsersTurn")
    return theResultOfUsersTurn
}

fun computersRoll1(): Int {
    println("Бросает компьютер")
    val computerTurn = aRollOfTheDice()
    val theResultOfComputersTurn = computerTurn
    println("Выпало у компьютера:$theResultOfComputersTurn")
    return theResultOfComputersTurn
}
var playerWins = 0
var computerWins = 0
fun champion() {
    val userScore = usersRoll()
    val computerScore = computersRoll()
    if (userScore > computerScore) {
        println("Победило человечество")
        playerWins++
    } else if (userScore < computerScore) {
        println("Победила машина")
        computerWins++
    } else {
        println("Chat gpt еще не доросла до победы")
    }
}

fun toRepeatGame() {
    while (true) {
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        val usersAnswer = readln()
        if (usersAnswer.equals("Да", ignoreCase = true)) {
            champion()
        } else {
            println("Количество побед игрока: $playerWins")
            println("Количество побед компьютера: $computerWins")
            break
        }
    }
}