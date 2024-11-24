package Lesson_11

fun main() {
}
class RecipeCategory(
    val name: String,
    val description: String,
    val imageUrl: String,
)
class Recipe(
    val title: String,
    val description: String,
    val cookingTime: Int,
    val categoryId: String,
    val ingredients: List<Ingredient>,
    val imageUrl: String,
)
class Ingredient(
    val id: String,
    val name: String,
    val quantity: String,
    val recipeId: String,
)