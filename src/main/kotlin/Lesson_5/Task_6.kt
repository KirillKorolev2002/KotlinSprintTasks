package Lesson_5
import kotlin.math.pow
fun main() {
    val personKiriiKorolev = PersonInformation(90.0, Weight.KILOGRAMS, 1.83, Height.METERS)
    personKiriiKorolev.printBMIInfo()

    val person2 = PersonInformation(100.0, Weight.KILOGRAMS, 1.80, Height.METERS)
    person2.printBMIInfo()
}

enum class Weight { KILOGRAMS, GRAMS }
enum class Height { METERS, CENTIMETERS }

data class PersonInformation(
    val weight: Double,
    val weightUnit: Weight,
    val height: Double,
    val heightUnit: Height,
) {
    val weightInKgs: Double
        get() = when (weightUnit) {
            Weight.KILOGRAMS -> weight
            Weight.GRAMS -> weight / GRAMMES_IN_KILOGRAMMES
        }

    val heightInMeters: Double
        get() = when (heightUnit) {
            Height.METERS -> height
            Height.CENTIMETERS -> height / CENTIMETERS_IN_METERS
        }

    fun bodyMassIndex(): Double {
        return weightInKgs / heightInMeters.pow(2.0)
    }

    fun getBMICategory(): String {
        val bmi = bodyMassIndex()
        return when {
            bmi < 18.5 -> "Недостаточная масса тела"
            bmi < 25 -> "Нормальная масса тела"
            bmi < 30 -> "Избыточная масса тела"
            else -> "Ожирение"
        }
    }
    fun printBMIInfo() {
        val resultBmi = getBMICategory()
        val formattedBMI = String.format("%.2f", resultBmi)
        println("BMI: $formattedBMI")
    }
}
const val GRAMMES_IN_KILOGRAMMES: Double = 1000.0
const val CENTIMETERS_IN_METERS: Double  = 100.0




