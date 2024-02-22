package com.codercampy.androidclass.practise

fun main() {

    //print all natural numbers from 1 to 100

//    for (i in 1 until 100) {
//        println(i)
//    }

    //only even numbers
//    for (i in IntRange(0, 100)) {
//        if (i % 2 == 0) {
//            println(i)
//        }
//    }

//    var i = 0
//    do {
//        println(i++)
////        if (i >= 100) {
////            break
////        }
//    } while (i < 100)'

    //Find the sum of all natural numbers from 1 to 100

    var sum = 1
    for (i in 1 .. 10) {
        if (i % 2 == 0) {
            sum *= i
            println(sum)
        }
    }
    println("Sum is ${sum}")

}