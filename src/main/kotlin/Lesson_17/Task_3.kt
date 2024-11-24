package Lesson_17

import kotlin.random.Random


fun main() {
    val secretFolder = Folder(" ", 1, Random.nextBoolean())
    println(secretFolder.name1)
    println(secretFolder.filesCount1)
}
private class Folder(val name: String,val filesCount: Int, private val isSecret: Boolean) {val name1: String
    get() {
        return ((if (isSecret) {
            println("скрытая папка")
        } else name).toString())
    }

    val filesCount1: Int
        get() {
            return((if (isSecret) {
                println(0)
            } else filesCount) as Int)
        }
}
