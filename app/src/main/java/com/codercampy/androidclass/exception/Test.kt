package com.codercampy.androidclass.exception

fun main() {

//    var a = 5
//
//    var b: Int? = null
//
//    println("Enter the second value")
//    b = readln().toIntOrNull()
//
//
//
//
//    //val sum = a + b!!
//
//    println("Sum is - " + sum)


    println("Enter the age of purab")
    val age = readln().toInt()

    try {
        if (age < 18) {
            throw PurabCantDriveException("Purab can't drive because he is less than 18 yrs old")
        }
    } catch (exception: Exception) {
        println("Hurray! We catched the exception - " + exception.stackTrace.joinToString())
        //throw exception
    } finally {
        println("Calling finally")
    }

}