package Lesson_6

fun main() {
    val createLogin = readln()
    val createPassword = readln()
    val enterLogin = readln()
    val enterPassword = readln()
    do {

        when {
            enterPassword == createPassword && enterLogin == createLogin -> {
                println("Авторизация прошла успешно")
                break
            } else -> {
            println("Неверный логин или пароль. Попробуйте снова.")
        }
        }
    } while (true)
}