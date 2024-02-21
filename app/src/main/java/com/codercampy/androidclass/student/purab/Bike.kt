package com.codercampy.androidclass.student.purab

/***
 * Take input of 5 vehicles and calculate it's net worth
 */

data class Bike(
    var name : String,
    var price : Int,
    var currentPrice: Int,
    var ownerName : String
)

fun main() {
    println("Enter the name of the Bike")
    val name = readln()
    println("Enter the price of the bike")
    val price = readln().toInt()
    println("Enter the current Price of the Bike")
    val currentPrice = readln().toInt()
    println("Enter the Owner's Name")
    val ownerName = readln()

    val bike = Bike(name,
        price,
        currentPrice,
        ownerName
    )

println(bike)

}