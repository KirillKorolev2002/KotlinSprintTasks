package Lesson_20

fun main() {

    val player = Player(name = "Герой", currentHealth = 50, maxHealth = 100)
    val heal: (Player) -> Unit = { player ->
        player.currentHealth = player.maxHealth
    }
    heal(player)
}
private class Player(val name: String, var currentHealth: Int, val maxHealth: Int)