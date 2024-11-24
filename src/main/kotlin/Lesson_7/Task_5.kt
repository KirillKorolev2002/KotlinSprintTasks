package Lesson_7

fun main() {
    val charRangeForPassword: CharRange = 'a'..'z'
    val intRangeForPassword: IntRange = 0..9
    val charRangeForPasswordBig: CharRange = 'A'..'Z'
    val thePassword = StringBuilder()
    val isLengthOfPassword = readln().toInt()

    if (isLengthOfPassword > MINIMUM_LENGTH) {
        for (i in 0 until isLengthOfPassword) {
            when ((0..2).random()) {
                0 -> thePassword.append(charRangeForPassword.random())
                1 -> thePassword.append(intRangeForPassword.random())
                2 -> thePassword.append(charRangeForPasswordBig.random())
            }
        }
        println(thePassword)
    }
}

const val MINIMUM_LENGTH = 5