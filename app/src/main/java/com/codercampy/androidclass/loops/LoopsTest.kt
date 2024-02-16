package com.codercampy.androidclass.loops

fun main() {

    /**
     *
     * Loop 100 times and print the value by multiplying with 3
     *
     *
     *
     */

    /**
     * Loops
     *
     * for
     * while
     * do while
     * break – labelled, unlabelled
     * continue – labelled, unlabelled
     *
     */

    /**
     * FOR Loop
     */

    // Loop to spam a phone number 100 times
    // 0 to 100

//    studentsLoop@ for (student in 1..10) {
//
//        secondLoop@ for (hour in 1..24) {
//            if (hour == 3 && student == 4) {
//                //Found
//                println("Hours for student $student, hour - $hour")
//               continue@secondLoop
//            }
//            println("Outside if - for student $student, hour - $hour")
//        }
//    }

    /**
     * While
     */

//    var i = 0
//    name1@ while (false) {
//        i++
//        if (i == 10) {
//           break@name1
//        }
//        println("Current value of i : $i")
//    }

    /**
     * Do While
     */

    var i = 0
    name1@ do {
        if (i == 10) {
            break@name1
        }
        println("Running do while for $i")
    } while (i++ < 100)



}