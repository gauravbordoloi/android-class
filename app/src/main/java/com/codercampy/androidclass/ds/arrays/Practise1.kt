package com.codercampy.androidclass.ds.arrays

fun main() {
    //Kotlin program to concatenate two integer arrays

    val arr1 = arrayOf(1, 2, 3, 4, 5)
    val arr2 = arrayOf(6, 7, 8, 9, 10)

    //val arr3 = arr1 + arr2

    val finalArr = Array(arr1.size + arr2.size) { i ->
        println()
        if (i < arr1.size) {
            //0-4
            arr1[i]
        } else {
            arr2[i - arr1.size]
        }
    }

    println(finalArr.joinToString())

}