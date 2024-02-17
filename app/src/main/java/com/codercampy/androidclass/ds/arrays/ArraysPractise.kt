package com.codercampy.androidclass.ds.arrays

/**
 * Arrays
 * Index - Always starts from 0
 * Size - Always starts from 1
 * Exception - IndexOutOfBounds - Item not present at the given index
 */

fun main() {

    /**
     * 1st way to create an array
     */

    val students = arrayOf("Rakesh", "Hitesh", "Ram", "Shane")
    val student1 = students[0]
    //println(student1)

    val studentMarks = arrayOf(54, 67, 13, 87)

    //Print the student name and the student marks together

//    for (i in 0 until students.size) {
//        println("Name : ${students[i]}, Marks - ${studentMarks[i]}")
//    }
//
//    for (i in students.indices) {
//        println("Name : ${students[i]}, Marks - ${studentMarks[i]}")
//    }


//    println("Size of the array is : ${students.size}")
//    println("Total marks of the students : ${studentMarks.sum()}")
//
//    for (i in 0 until 100) {
//        println(i)
//    }
//
//    var i = 0
//    while (i < students.size) {
//        println(studentMarks[i])
//        i++
//    }

    //Find the first student who got more than 60 marks
//    for (i in 0 until studentMarks.size) {
//        println(i)
//        //0 -> 54
//        //1 -> 67
//        //2 -> 13
//        //3 -> 87
//        if (studentMarks[i] > 60) {
//            println("Student found with greater than 60 marks : Index - $i, Mark - ${studentMarks[i]}")
//            break
//        }
//    }


    /**
     * 2nd way of creating an array
     */

    val bikeCCs = arrayOf(250, 450, 290, 500)


//    val topSpeeds = arrayOf(0.0, 0.0, 0.0, 0.0)
//
//    for (i in bikeCCs.indices) {
//        topSpeeds[i] = bikeCCs[i] * 2.5
//    }

    val topSpeedsNewArr = Array(bikeCCs.size) { i ->
        if (bikeCCs[i] < 300) {
            bikeCCs[i] * 2.5
        } else {
            bikeCCs[i] * 4.5
        }
    }

    println("Top Speeds - ${topSpeedsNewArr.joinToString(" and ")}")


    //Q1 - Create 2 arrays with 4 vehicles with their name and mileage and calculate the economy of the bike
    // Economy Formula - mileage / 96.5

}