package Lesson_18

fun main() {
    val animals: MutableList<Tamagotchi> = mutableListOf(Fox("1"), Dog("2"), Cat("3"))

    for (animal in animals) {
        animal.eat()
    }
}
interface Tamagotchi {
    val name: String
    fun eat()
}

class Fox(override val name: String) : Tamagotchi {
    override fun eat() {
        println("$name -> ест ягоды")
    }
}

class Dog(override val name: String) : Tamagotchi {
    override fun eat() {
        println("$name -> ест кости")
    }
}

class Cat(override val name: String) : Tamagotchi {
    override fun eat() {
        println("$name -> ест рыбу")
    }
}