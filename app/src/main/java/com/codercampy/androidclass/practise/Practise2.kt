package com.codercampy.androidclass.practise

//fun main() {
//
//    /**
//     * https://codercampy.com/cyclically-rotate-an-array-by-one/
//     */
//
//    //static
//    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
//
//    //dynamic
////    val arr1 = Array(5) { i ->
////        println("Running for index - $i")
////        i * i
////    }
////
////    println(arr1.joinToString())
//
//    val lastItem = arr[arr.size - 1]
//    var i = arr.size - 1 //4
//
//    while (i >= 0) {
//        if (i == 0) {
//            arr[i] = lastItem
//        } else {
//            arr[i] = arr[i - 1]
//        }
//        i--
//    }
//
////    for (i in arr.indices) {
////        if (i > 0) {
////            println(arr[i-1])
////            arr[i] = arr[i-1]
////        }
////    }
//
////    for (i in arr.indices) {
////        if (i > 0) {
////            println(arr[i-1])
////            arr[i] = arr[i-1]
////        }
////    }
//    arr[0] = lastItem
//
//    println(arr.joinToString())
//
////    val newArr = Array(arr.size) { i ->
////        if (i == 0) {
////            arr[arr.size - 1]
////        } else {
////            arr[i - 1]
////        }
////    }
////
////    println(newArr.joinToString())
//
//    println("Enter n")
//    val n = readln().toInt()
//
//    sum(5, 6) {
//        println("Sum of 5 and 6 is $it")
//    }
//
//}

fun main() {
    sum(5, 6) { i ->
        println("Sum of 5 and 6 is $i")
    }
}

fun sum(a: Int, b: Int, cb: (Int) -> Unit) {
    cb(a + b)
}