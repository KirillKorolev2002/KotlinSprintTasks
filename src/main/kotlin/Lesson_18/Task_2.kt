package Lesson_18

import kotlin.random.Random
fun main() {
    val dice: List<Die> = listOf(D4(), D6(), D8(), D4(), D6())
    for (die in dice) {
        die.roll()
    }
}
open class Die(val sides: Int) {open fun roll() {
    Random.nextInt(sides)
}
}
class D4 : Die(4)
class D6 : Die(6)
class D8 : Die(8)
