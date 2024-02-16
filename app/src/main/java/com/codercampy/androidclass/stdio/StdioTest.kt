package com.codercampy.androidclass.stdio

class StdioTest {


}

fun main() {

    /**
     * Stdio
     */

    /**
     * Get bio data from a student
     */

    println("Enter the name of the student")
    val name = readln()

    println("Enter the age of the student")
    val age = readln().toInt()

    println("Enter the percentage of the student")
    val percentage = readln().toFloat()

    println("Does the student have a macbook?")
    val hasMac = readln().toBoolean()

//    if (age > 18) {
//        println("$name can vote")
//    }

    println(
        """
        Student details
        Name : $name
        Age : $age
        Percentage : $percentage
        Has a macbook : $hasMac
        Student Grade : ${getStudentGrade(percentage)}
        Can the student vote : ${age >= 18}
    """.trimIndent()
    )

}

fun getStudentGrade(perc: Float): String {
    return if (perc > 90 && perc <= 100) {
        "Grade A"
    } else if (perc > 80 && perc <= 90) {
        "Grade B"
    } else if (perc > 70 && perc <= 80) {
        "Grade C"
    } else if (perc > 60 && perc <= 70) {
        "Grade D"
    } else {
        "Grade E"
    }
}