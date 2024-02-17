package com.codercampy.androidclass.ds.arrays

fun main() {

    //Array Reverse

    // 1,2,3,4,5
    //output -> 5,4,3,2,1

    val originalArr = Array(10) { i -> generateRandomNumber() }
    val reverseArr = Array(10) { i ->
        //10-1-0 = 9
        //10-1-1
        //10-1-2
        //10-1-3
        //10-1-9 = 0
        originalArr[originalArr.size - 1 - i]
    }

    println("Original - ${originalArr.joinToString()}")
    println("Reverse - ${reverseArr.joinToString()}")

}