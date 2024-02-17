package com.codercampy.androidclass.student.purab

import com.codercampy.androidclass.ds.arrays.generateRandomNumber
import kotlin.random.Random

class Teesting {
}
//fun main(){
//    val vehicleName = arrayOf("Meteor", "Himalayan", "Scram", "Hunter" )
//    val vehicleMileage = arrayOf(35.2, 29.7, 30.2,35.00)
//
//    val vehicleEconomy = Array(vehicleName.size, { i -> vehicleMileage[i] / 96.5 })
//    println("Econmoy of the vehicle is: ${vehicleEconomy.joinToString()}")
//}


//fun main(){
//    val vehicleName = arrayOf("Meteor", "Himalayan", "Scram", "Hunter" )
//    val vehicleMileage = Array(vehicleName.size) { i ->
//        println("What's the Mileage of ${vehicleName[i]}?")
//        readln().toFloat()
//    }
//
//    val vehicleEconomy = Array(vehicleName.size, { i -> vehicleMileage[i] / 96.5 })
//   // println("Economy of the vehicle is: ${vehicleEconomy.joinToString()}")
//    for (i in vehicleName.indices){
//        println("Name of the Vehicle ${vehicleName[i]} and Mileage is ${vehicleEconomy[i]}")
//    }
//}



//Kotlin program to check if an array contains a given value


fun main(){
    val arr = Array(100,{ i -> generateRandomNumber1() })
    println(arr.joinToString())
    println("Enter the Number to find from 0 to 10")
    val num= readln().toInt()
    for (i in arr.indices){
        if (num == arr[i]){
            println("Number is found in ${i} index")
            break
        }
    }



}

fun generateRandomNumber1(): Int {
    return Random.nextInt(0, 10)
}




