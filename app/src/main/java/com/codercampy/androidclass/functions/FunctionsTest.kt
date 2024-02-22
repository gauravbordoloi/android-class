package com.codercampy.androidclass.functions

fun main() {

    //Default
//    vehicleDetails("Ciaz", 2016)
//
//    //Named
//    vehicleDetails2(yearOfManufacture = 2024, name = "Creta")

    //println("Sum of nth number : ${sumOfNthNumber(10)}")

//    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    println("Sum of array : ${sumOfArray(arr)}")

    //vehicleDetails2(yearOfManufacture = 2024, name = "Enfield")

    println(sumOfNthNumber(10))

}

/**
 * Default argument
 */
fun vehicleDetails(name: String, yearOfManufacture: Int = 2024) {
    println("Name : $name, Mfg Date : $yearOfManufacture")
}

/**
 * Named argument
 */
fun vehicleDetails2(name: String, yearOfManufacture: Int) {
    println("Name : $name, Mfg Date : $yearOfManufacture")
}

/**
 * Recursive function
 */
fun sumOfNthNumber(n: Int): Int {
    if (n < 1) {
        return n
    }
    return n + sumOfNthNumber(n - 1)
}

/**
 * Recursive function to calculate the sum of an array
 */
fun sumOfArray(arr: Array<Int>): Int {
    if (arr.size <= 1) {
        return arr[0]
    }
    return arr[arr.size - 1] + sumOfArray(arr.sliceArray(IntRange(0, arr.size - 2)))
}