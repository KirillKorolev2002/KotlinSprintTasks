package Lesson_20

import kotlin.random.Random

fun main() {
    val playerKeys = Player(name = "Герой", hasKey = Random.nextBoolean())
    val checkDoor: (Player) -> String = { player ->
        if (player.hasKey) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }
    println(checkDoor(playerKeys))
}

class Player(val name: String, var hasKey: Boolean)