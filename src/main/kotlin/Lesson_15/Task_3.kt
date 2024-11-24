package Lesson_15

fun main() {
    val admin = Administrator()
    admin.addUser ("Алиса")
    admin.addUser ("Боб")
    admin.addMessage("Привет, всем!")

    admin.deleteUser ("Алиса")
    admin.deleteMessage("Привет, всем!")

}

abstract class Forum(
    val users: MutableList<String> = mutableListOf(),
    val messages: MutableList<String> = mutableListOf(),
) {
    abstract fun addUser (user: String)
    abstract fun addMessage(message: String)
}

class User : Forum() {
    override fun addUser (user: String) {
        users.add(user)
    }

    override fun addMessage(message: String) {
        messages.add(message)
    }
}

class Administrator : Forum() {
    fun deleteUser (user: String) {
        users.remove(user)
    }

    fun deleteMessage(message: String) {
        messages.remove(message)
    }

    override fun addUser (user: String) {
        users.add(user)
    }

    override fun addMessage(message: String) {
        messages.add(message)
    }
}