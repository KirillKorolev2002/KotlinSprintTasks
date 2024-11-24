package Lesson_13

fun main() {
    val chat = Chat()

    chat.addMessage("Привет, как дела?", "Автор1")
    chat.addMessage("Все хорошо, а у тебя?", "Автор2")

    chat.addThreadMessage("У меня тоже все хорошо", "Автор1", 0)
    chat.addThreadMessage("Отлично", "Автор2", 0)

    chat.printChat()
}

class Chat {
    private val messages: MutableList<Message> = mutableListOf()
    private val childMessages: MutableList<ChildMessage> = mutableListOf()
    private var id = 0
    fun addMessage(text: String, author: String) {
        val newMessage = Message(
            messageId = id++,
            text = text,
            author = author
        )
        messages.add(newMessage)
    }

    fun addThreadMessage(text: String, author: String, parentMessageId: Int) {
        val newThread = messages.find { it.messageId == parentMessageId }
        if (newThread != null) {
            val newChildMessage = ChildMessage(
                childMessageId = id++,
                text = text,
                author = author
            )
            childMessages.add(newChildMessage)
        } else {
            println("Не найдено сообщение $newThread")
        }

    }

    fun printChat() {
        for (message in messages) {
            println("${message.messageId}, Автор: ${message.author}: ${message.text}")
            for (child in childMessages) {
                println("\t ${child.childMessageId}, Автор: ${child.author}: ${child.text}")
            }
        }
    }
}

data class Message(val messageId: Int, val text: String, val author: String)
data class ChildMessage(val childMessageId: Int, val text: String, val author: String)