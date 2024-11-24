package Lesson_19

enum class GroupOfFishes {
    Guppy, Angelfish, Goldfish, SiameseFightingFish
}

fun main() {

    for (fish in GroupOfFishes.values())
        println(fish)

}