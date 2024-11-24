package Lesson_19

enum class Gender {
    MALE,
    FEMALE,
}
data class Person(val name: String, val gender: Gender)
fun main() {
    val people = mutableListOf<Person>()
    repeat(5) {
        val name = readln()
        print("Введите пол для человека  (MALE/FEMALE): ")
        val genderInput = readln().lowercase()
        val gender = when (genderInput) {
            "MALE" -> Gender.MALE
            "FEMALE" -> Gender.FEMALE
            else -> {
                println("Неверный ввод")
            }
        }
        people.add(Person(name, gender as Gender))
    }
    println("Список людей:")
    for (person in people) {
        println("Имя: ${person.name}, Пол: ${person.gender}")
    }
}