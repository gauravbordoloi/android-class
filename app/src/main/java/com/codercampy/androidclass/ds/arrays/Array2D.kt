package com.codercampy.androidclass.ds.arrays

fun main() {

    val arr = arrayOf(
        arrayOf(4, 2, 6, 8, 1), // 0
        arrayOf(6, 23, 8), // 1
        arrayOf(12, 76, 121, 97, 23) //2
    )

    var sum = 0
    for (i in arr.indices) {
        for (j in arr[i].indices) {
            sum += arr[i][j]
        }
    }

    println("Sum is $sum")

//    var newCode = ""
//    for (i in 100 downTo 0) {
//        newCode += ""
//        if (newCode.length % 4 == 0) {
//            newCode += "-"
//        }
//    }

    println("Enter number a")
    val a = readln().toInt()

    println("Enter number b")
    val b = readln().toInt()

    val value = multiplication(a, b)
    println("Multiplication of $a and $b is $value")

}

fun multiplication(a: Int, b: Int = 5): Int {
    return a * b
}