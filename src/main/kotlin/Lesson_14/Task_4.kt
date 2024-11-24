package Lesson_14

fun main() {
    val contacts = mutableListOf<PhoneBookEntry>()
    val inputContacts = listOf(
        Triple("Кирилл Королев", "89200188827"," "),
        Triple("Иван Ветров", null," "),
        Triple("1", "892001834644","Open AI"),
        Triple("2", "892001856546843664", null),
        Triple("4", "89200188664544","Lukoil"),
    )
    for (input in inputContacts) {
        val name = input.first
        val numberInput = input.second
        val numberOfPhone = numberInput?.toLongOrNull()
        if (numberOfPhone == null) {
            println("Не удалось добавить контакт.")
            break
        }
        contacts.add(PhoneBookEntry(name, numberOfPhone))
    }

    contacts.forEach { println(it) }
    val companies = contacts.mapNotNull { it.company }.toSet()
    println("Список компаний в телефонной книге: $companies")
}

class PhoneBookEntry(
    val name: String,
    val numberOfPhone: Long,
    var company: String? = null,
)