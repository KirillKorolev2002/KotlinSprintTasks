package Lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()

    for (i in 1..5) {
        println("Введите название ингредиента $i:")
        val ingredient = readln()
        ingredients.add(ingredient)
    }
    val sortedIngredients = ingredients.sorted()

    val stringSortedIngredients = (sortedIngredients.joinToString(", ")).replaceFirstChar { it.uppercase() }


    println(stringSortedIngredients)
}