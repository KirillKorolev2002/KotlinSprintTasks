package Lesson_17

fun main() {
    val user = User("user", "Password")
    user.login = "newUser"
    user.password = "newPassword"
}

class User(private var _login: String, private var _password: String) {
    var login: String = ""
        get() = _login
        set(value) {
            field = value
            println("Логин успешно изменен/")
        }
    var password: String = ""
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
}