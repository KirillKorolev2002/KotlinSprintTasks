package Lesson_11

fun main() {
    val user1 = User(
        id = "@kirillkorolev2002",
        login = 4040,
        password = "Losost",
        mail = "kirillkorolev2002@mail.ru"
    )
    println(user1.userToString())

    val user2 = User(
        id = "@gleb.nikitin9696",
        login = 4041,
        password = "SecurePassword",
        mail = "gleb.nikitin.9696@mail.ru"
    )
    println(user2.userToString())
}

class User(
    var id: String = " ",
    var login: Int = 0,
    var password: String = " ",
    var mail: String = " ",
) {
    fun userToString(): String {
        return "ID: $id, Login: $login, Password: $password, Mail: $mail"
    }
}