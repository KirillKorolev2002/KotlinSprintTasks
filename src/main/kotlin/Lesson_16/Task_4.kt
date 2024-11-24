package Lesson_16

fun main() {
    val order = Order("12345", "Новый")
    println(order.getOrderInfo())
    order.requestStatusChange("В обработке")
    println(order.getOrderInfo())
}

open class Order(private val orderNumber: String, private var status: String) {
    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun requestStatusChange(newStatus: String) {
        changeStatus(newStatus)
    }

    fun getOrderInfo(): String {
        return "Заказ номер: $orderNumber, Статус: $status"
    }
}