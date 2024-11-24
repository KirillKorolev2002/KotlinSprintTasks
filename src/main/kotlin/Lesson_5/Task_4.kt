package Lesson_5

fun main() {
    val registeredUsername = "Zaphod"
    val registeredPassword = "PanGalactic"

    println("Введите имя пользователя:")
    val username = readln()
    if (username == registeredUsername) {
        println("Введите пароль:")
        val password = readln()
        if (password == registeredPassword) {
            println("Входите")
        } else {
            println("Неправильный пароль. Доступ запрещен.")
        }
    } else {
        println("Пользователь не зарегистрирован. Пожалуйста, зарегистрируйтесь для доступа.")
    }
}