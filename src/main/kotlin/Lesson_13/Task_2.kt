package Lesson_13

class ContactInfo(private val name: String, private val phoneNumber: String, private val company: String? = null) {

    fun printContactInfo() {
        val companyInfo = company ?: "<не указано>"
        println("Имя: $name, Номер: $phoneNumber, Компания: $companyInfo")
    }
}

fun main() {
    val contact = ContactInfo("Ростислав", "89123456789")
    contact.printContactInfo()

    val contactWithCompany = ContactInfo("Алексей", "89123456780", "Reddit")
    contactWithCompany.printContactInfo()
}
