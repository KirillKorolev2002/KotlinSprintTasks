package Lesson_19

fun main() {
    val product1 = Product("Футболка", 1, Category.CLOTHING)
    val product2 = Product("Ручка", 2, Category.STATIONERY)
    val product3 = Product("Что-то", 3, Category.MISCELLANEOUS)

    product1.displayInfo()
    product2.displayInfo()
    product3.displayInfo()
}
enum class Category(private val displayName: String) {
    CLOTHING("Одежда"),
    STATIONERY("Канцелярские товары"),
    MISCELLANEOUS("Разное");

    fun getDisplayName(): String {
        return displayName
    }
}

data class Product(val name: String, val id: Int, val category: Category) {
    fun displayInfo() {
        println("Название товара: $name")
        println("ID товара: $id")
        println("Категория: ${category.getDisplayName()}")
    }
}