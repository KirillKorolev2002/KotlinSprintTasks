package Lesson_21

fun <K, V : Comparable<V>> Map<K, V>.maxCategory(): K? {
    return this.maxByOrNull { it.value }?.key
}

fun main() {
    val skills = mapOf(
        "Strength" to 10,
        "Agility" to 15,
        "Intelligence" to 15,
        "Charisma" to 5
    )
    val maxSkill = skills.maxCategory()
    println(maxSkill)

    val skills2 = mapOf(
        "Strength" to 5,
        "Agility" to 5,
        "Intelligence" to 10,
        "Charisma" to 5
    )
    val maxSkill2 = skills2.maxCategory()
    println(maxSkill2)

    val emptySkills = emptyMap<String, Int>()
    val maxSkill3 = emptySkills.maxCategory()
    println(maxSkill3)
}