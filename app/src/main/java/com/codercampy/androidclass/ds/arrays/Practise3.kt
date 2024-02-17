package com.codercampy.androidclass.ds.arrays

import kotlin.random.Random

fun main() {

    /**
     * Kotlin program to find all the number below 500 and all the numbers above 500 and store them in separate arrays
     */

    val arr = Array(100) { i -> generateRandomNumber1() }

    val list1 = mutableListOf<Int>()
    val list2 = mutableListOf<Int>()

    for (i in arr.indices) {
        if (arr[i] > 500) {
            list2.add(arr[i])
        } else {
            list1.add(arr[i])
        }
    }

    println(arr.joinToString())
    println("list1 ${list1.joinToString()}")
    println("list2 ${list2.joinToString()}")

}

fun generateRandomNumber1(): Int {
    return Random.nextInt(100, 1000)
}