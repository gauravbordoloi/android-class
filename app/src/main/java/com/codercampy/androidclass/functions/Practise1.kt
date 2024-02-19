package com.codercampy.androidclass.functions

import com.codercampy.androidclass.ds.arrays.generateRandomNumber

fun main() {

    val arr = Array(10) { i -> generateRandomNumber() }
    println("THe array is ${arr.joinToString()}")

    println("Total sum is ${sumOfArr(arr)}")

    println("Factorial of 10 is ${factorial(10)}")

}

// n * (n-1) * (n-2) * (n-3)
fun factorial(n: Int): Int {
    if (n == 1) {
        return 1
    }
    return n * factorial(n - 1)
}

fun sumOfArr(arr: Array<Int>): Int {
    if (arr.size == 1) {
        return arr[0]
    }
    return arr[0] + sumOfArr(arr.sliceArray(IntRange(1, arr.size - 1)))
}