package Lesson_21

fun main() {
    val player = Player("Hero", 100, 100)
    player.currentHealth = 50
    val isPlayerStillHealthy = player.isHealthy()
    println(isPlayerStillHealthy)
}

class Player(val name: String, var currentHealth: Int, var maxHealth: Int)

fun Player.isHealthy(): Boolean {
    return this.currentHealth == this.maxHealth
}