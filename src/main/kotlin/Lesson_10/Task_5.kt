package Lesson_10

fun main() {
    val login = readln()
    val password = readln()
    val tokenList = getToken()
    val tokenString = tokenList.joinToString("")
    println(tokenString)
    getBasket(login, password)
}

fun getAuthorizations(login: String, password: String): MutableList<String>? {
    return when (login == LOGIN && password == PASSWORD) {
        true -> getToken()
        false -> null
    }
}

fun getToken(): MutableList<String> {
    val containsOfToken = ('1'..'9') + ('A'..'Z') + ('a'..'z')
    val token = mutableListOf<String>()
    for (i in 0 until 32) {
        val randomOfList = containsOfToken.random()
        token.add(randomOfList.toString())
    }
    return token

}

fun getBasket(login: String, password: String) {
    if (getAuthorizations(login, password) == null) {
        println("Неудачная авторизация")
    } else {
        println(BASKET)
    }
}

const val BASKET = "Something"
const val LOGIN = "Кирилл Королев"
const val PASSWORD = "4040"