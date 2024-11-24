package Lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val eventDate: String,
    val distanceLightYears: Int
)

fun main() {
    val alphaCentauri = GalacticGuide(
        name = "Альфа центавра",
        description = "Система Центавра",
        eventDate = "2024-11-11",
        distanceLightYears = 5
    )

    println("Название: ${alphaCentauri.name}")
    println("Описание: ${alphaCentauri.description}")
    println("Дата и время события: ${alphaCentauri.eventDate}")
    println("Расстояние от Земли: ${alphaCentauri.distanceLightYears} световых лет")
}