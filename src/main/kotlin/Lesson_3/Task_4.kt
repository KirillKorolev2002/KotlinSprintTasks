package Lesson_3

fun main() {
    val theFirstNumber = readln().toInt()


    val theTitle = """
    $theFirstNumber*1=${theFirstNumber * 1}
    $theFirstNumber*2=${theFirstNumber * 2}
    $theFirstNumber*3=${theFirstNumber * 3}
    $theFirstNumber*4=${theFirstNumber * 4}
    $theFirstNumber*5=${theFirstNumber * 5}
    $theFirstNumber*6=${theFirstNumber * 6}
    $theFirstNumber*7=${theFirstNumber * 7}
    $theFirstNumber*8=${theFirstNumber * 8}
    $theFirstNumber*9=${theFirstNumber * 9}
    """.trimIndent()

    println(theTitle)
}