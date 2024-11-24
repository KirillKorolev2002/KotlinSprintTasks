package Lesson_15

fun main() {
    val crucian = Carp()
    crucian.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.fly()
    duck.swim()
}

interface SwimmingEnvironment {
    fun swim() {
        println("Плавает")
    }
}

interface FlyingEnvironment {
    fun fly() {
        println("Летает")
    }
}
class Carp : SwimmingEnvironment
class Seagull : FlyingEnvironment
class Duck : SwimmingEnvironment, FlyingEnvironment {
    override fun swim() {
        println("Утка плавает")
    }
    override fun fly() {
        println("Утка летает")
    }
}