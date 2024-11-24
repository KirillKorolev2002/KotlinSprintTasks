package Lesson_20

fun main() {
    val list = listOf("Элемент 1", "Элемент 2", "Элемент 3", "Элемент 4", "Элемент 5", "Элемент 6")
    val actionList = list.mapIndexed { index, element ->
        { println("Нажат элемент $element") }
    }
    actionList.filterIndexed { index, _ -> index % 2 == 0 }.forEach { action ->
        action()
    }
}