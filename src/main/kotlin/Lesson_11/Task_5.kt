package Lesson_11

fun main() {
    val forum = Forum()
    forum.printThread()
}

class Forum () {

    val countOfUsers = mutableListOf<User>()
    val countOfMessages = mutableListOf<Message>()


    fun createNewMessage(newAuthorId: Int, messageText: String) {
        val userIdFoundOnServer = countOfUsers.find { it == newAuthorId }
        if (userIdFoundOnServer != null) {
            val newMessage = Message(newAuthorId, messageText)
            countOfMessages.add(newMessage)
        } else {
            println(1)
        }
    }
    fun printThread() {
        for (i in countOfUsers) {
            for (j in countOfMessages)
                println("${countOfUsers}:${countOfMessages}")
        }
    }
}

private class User1(val userId: Int, val userName: String)
class Message(val authorId: Int, val message: String)