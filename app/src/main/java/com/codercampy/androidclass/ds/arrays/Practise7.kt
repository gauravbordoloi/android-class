package com.codercampy.androidclass.ds.arrays

fun main() {

    /**
     * Write a program to check if elements of an array are same or not it read from front or back
     */

    val arr = Array(10) { i -> generateRandomNumber() }
    //val arr = arrayOf(1, 2, 3, 2, 1)

    println("Original Arr - ${arr.joinToString()}")

    val reversedArr = Array(arr.size) { i ->
        //i = 0, size - 1 - 0
        //i = 1, size - 1 - arr1
        //i = 2, size - 1 -arr2
        arr[arr.size - 1 - i]
    }

    var isSimilar = true
    for (i in arr.indices) {
        if (arr[i] != reversedArr[i]) {
            isSimilar = false
            break
        }
    }

    if (isSimilar) {
        println("Array is similar if backward")
    } else {
        println("Array is not similar if backward")
    }

}