package Lesson_22

class RegularBook1(val title: String, val author: String)
data class DataBook1(val title: String, val author: String)
fun main() {
    val regularBook = RegularBook1("Что то", "Что то очень важное")
    val dataBook = DataBook1("Что то", "Что то очень важное")
    println(regularBook)
    println(dataBook)
}

/*
Lesson 22.RegularBook1@b4c966a
DataBook1(title=Что то, author=Что то очень важное)
В первом случае выводится Unit code, а во втором компилятор автоматически генерирует дополнительные функции-члены, которые позволяют выводить экземпляр в удобочитаемый вид, сравнивать экземпляры, копировать экземпляры и многое другое.
 */