package com.codercampy.androidclass.ds.arrays

import kotlin.random.Random

fun main() {

    /**
     * Kotlin program to find largest element in an array
     */

    val arr = Array(100) { i -> generateRandomNumber() }

    var currentLargest = 0
    for (i in arr.indices) {
        if (arr[i] > currentLargest) {
            currentLargest = arr[i]
        }
    }

    println(arr.joinToString())
    println("The largest element is $currentLargest")

}

fun generateRandomNumber(): Int {
    return Random.nextInt(100, 1000)
}