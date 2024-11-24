package Lesson_16

fun main() {
    val player = Player("Игрок", 100, 30)
    player.takeDamage(80)
    player.heal(10)
    player.takeDamage(50)
    println(player.getInfo())
}
class Player(private var name: String, private var health: Int, private var attackPower: Int) {

    fun takeDamage(damage: Int) {
        if (health > 0) {
            health -= damage
            if (health <= 0) {
                die()
            }
        }
    }
    fun heal(amount: Int) {
        if (health > 0) {
            health += amount
        } else {
            println("$name мертв.")
        }
    }
    private fun die() {
        health = 0
        attackPower = 0
    }
    fun getInfo(): String {
        return "Игрок: $name, Здоровье: $health, Сила удара: $attackPower"
    }
}