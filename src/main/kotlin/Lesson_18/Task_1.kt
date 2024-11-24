package Lesson_18

fun main() {
    val order1 = Order()
    println(order1.displayInformation("12345", "Samsung"))
    val order2 = Order()
    println(order2.displayInformation("12345", listOf("Samsung", "Galaxy A31")))
}

class Order {
    fun displayInformation(orderNumber: String, items: String): String {
        return "Order Number: $orderNumber, Item: $items"
    }

    fun displayInformation(orderNumber: String, items: List<String>): String {
        return "Order Number: $orderNumber, Items: ${items.joinToString(", ")}"
    }
}