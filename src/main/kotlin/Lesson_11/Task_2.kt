package Lesson_11

fun main() {
    val user = User2(
        id = "@kirillkorolev2002",
        login = 4040,
        password = "Losost",
        mail = "kirillkorolev2002@mail.ru",
        bio = " "
    )

    user.enterBio()

    val passwordChanged = false
    while (passwordChanged == user.changePassword()) {
        user.changePassword()
    }

    println(user.userToString())
}

class User2(
    var id: String = " ",
    var login: Int = 0,
    var password: String = " ",
    var mail: String = " ",
    var bio: String = " ",
) {
    fun userToString(): String {
        return "ID: $id, Login: $login, Password: $password, Mail: $mail, Bio: $bio"
    }

    fun enterBio(): String {
        println("Введите информацию о себе:")
        bio = readln()
        return bio
    }

    fun changePassword(): Boolean {
        println("Введите текущий пароль:")
        val currentPassword = readln()
        return if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен")
            true
        } else {
            println("Неверный текущий пароль.")
            false
        }
    }
}