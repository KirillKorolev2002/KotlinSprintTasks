package Lesson_17

fun main() {

    val fish = Quiz(
        _question = "Что за рыба?",
        _answer = "Карась"
    )
    println(fish.question)
    println(fish.answer)
}

class Quiz(var _question: String, var _answer: String) {
    val question: String
        get() = _question
    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}