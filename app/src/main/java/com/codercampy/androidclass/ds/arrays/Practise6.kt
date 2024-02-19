package com.codercampy.androidclass.ds.arrays

fun main() {

    /**
     * Write a program to remove a specific element from an array.
     */

    val arr = arrayOf(12, 53, 124, 543, 12, 57, 43, 122, 754)

//    println("Enter the index to remove")
//    val indexToRemove = readln().toInt()
//
//    val newArr = Array(arr.size - 1) { i ->
//        if (i >= indexToRemove) {
//            arr[i + 1]
//        } else {
//            arr[i]
//        }
//    }

    println("Enter the item to remove")
    val itemToRemove = readln().toInt()

//    var indexToRemove = 0
//    for (i in arr.indices) {
//        if (arr[i] == itemToRemove) {
//            indexToRemove = i
//            break
//        }
//    }

    //arr.indexOfFirst { it == itemToRemove }

    val sortedArr = arr.sortedArray()
    val newArr = Array(arr.size - 1) { i ->
        if (sortedArr[i] >= itemToRemove) {
            sortedArr[i + 1]
        } else {
            sortedArr[i]
        }
    }

    println(newArr.joinToString())

}