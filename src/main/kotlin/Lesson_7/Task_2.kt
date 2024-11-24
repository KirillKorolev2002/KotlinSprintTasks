package Lesson_7

fun main() {
    var sentCode = (1000..9999).random()
    println("Ваш код авторизации:$sentCode")

    for (i in generateSequence(0) { it }) {
        val codeOfAuthorization = readln().toInt()

        if (codeOfAuthorization == sentCode) {
            println("Здравствуйте")
            break
        } else {
            println("Внимательнее,вы опять ошиблись")
            sentCode = (1000..9999).random()
            println("Ваш новый код авторизации:$sentCode")
        }
    }
}