package com.codercampy.androidclass.conditions

fun main() {

    /**
     * Conditional Statements
     * If-Else
     * When
     */

    /**
     * If-Else
     */

//    println("Enter age")
//    val age = readln().toInt()
//
//    if (age > 18) {
//        println("User can vote")
//    } else if (age < 18) {
//        println("User can't vote")
//    }

    randomFunction()

}

fun randomFunction() {
    var i = 0
    do {

        when(i) {
            20 -> println("Hey we found the number 20")
            else -> println("Naaah")
        }

    } while (i++ < 100)
}

fun getGradeOfStudent(percentage: Float): String {
    return when {
        (percentage > 90 && percentage < 100) -> {
            val a = 1212
            //eufewurtfhrijgt
            "Grade A"
        }
        (percentage > 80 && percentage < 90) -> "Grade B"
        (percentage > 70 && percentage < 80) -> {
            "Grade C"
        }
        (percentage > 60 && percentage < 70) -> {
            "Grade D"
        }
        (percentage > 50 && percentage < 60) -> {
            "Grade E"
        }
        else -> "Failed"
    }

//    return "Failed"
}