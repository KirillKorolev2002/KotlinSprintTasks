package Lesson_13

class ContactInfo(private val name: String, private val phoneNumber: String, private val company: String? = null) {

    fun getCompanyInfo(): String {
        return company ?: "<не указано>"
    }

    override fun toString(): String {
        return "Имя: $name, Номер: $phoneNumber, Компания: ${getCompanyInfo()}"
    }
}

fun main() {
    val contacts = listOf(
        ContactInfo("Ростислав", "89123456789"),
        ContactInfo("Алексей", "89123456780", "Reddit"),
        ContactInfo("Мария", "89123456781"),
        ContactInfo("Сергей", "89123456782", "null"),
        ContactInfo("Анна", "89123456783")
    )

    val companies = contacts.map { it.getCompanyInfo() }.toSet()
    println("Список компаний в телефонной книге: $companies")
}
