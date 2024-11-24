package Lesson_15

abstract class Forum(val name: String, var quantity: Int)
interface Searchable {
    fun search(): String
}

class Instrument(name: String, quantity: Int) : Forum(name, quantity), Searchable {
    override fun search(): String {
        Thread.sleep(10000)
        return "Выполняется поиск..."
    }
}

class Accessory(name: String, quantity: Int) : Forum(name, quantity)

fun main() {
    val guitar = Instrument(name = "Гитара", quantity = 4)
    val stringSet = Accessory(name = "Набор струн", quantity = 44)
    println("${guitar.name} - количество на складе: ${guitar.quantity}")
    println("${stringSet.name} - количество на складе: ${stringSet.quantity}")
    println(guitar.search())
}