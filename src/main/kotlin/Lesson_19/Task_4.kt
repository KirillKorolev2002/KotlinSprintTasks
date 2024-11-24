package Lesson_19

fun main() {
    val myTank = Tank()
    myTank.arm(AmmoType.BLUE)
    myTank.fire()
    myTank.arm(AmmoType.GREEN)
    myTank.fire()
    myTank.arm(AmmoType.RED)
    myTank.fire()
}

enum class AmmoType(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank {
    var currentAmmoDamage: AmmoType? = null
    fun arm(ammoType: AmmoType) {
        currentAmmoDamage = ammoType
        println("Танк заряжен патронами: ${ammoType.name}")
    }
    fun fire() {
        println("Урон: $currentAmmoDamage")
    }
}