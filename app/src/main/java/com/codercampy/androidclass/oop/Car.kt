package com.codercampy.androidclass.oop

interface CalculateAvg {

    fun getAvg(): Int {
        return 100
    }

}

open class Vehicle {

    private var noOfWheels: Int? = null

    protected var isPetrol: Boolean = false

    var requiresLicense: Boolean = false

}

//Inheritance
open class Bike : Vehicle(), CalculateAvg {

    var name: String? = null

    init {
        isPetrol = true
    }

    override fun getAvg(): Int {
        return 4 * 45
    }

}

fun abc(ds: Vehicle) {
    if (ds is Bike) {
        //
    }
}

open class Car : Vehicle(), CalculateAvg {

    var name: String? = null

    init {
        isPetrol = true
    }

    override fun getAvg(): Int {
        return 2 * 45
    }

}

//Multiple inheritance
class Himalayan : Bike() {

    var model: String? = null

}

fun main() {

    val bike = Bike()
    val car = Car()

    abc(Vehicle())
    abc(Bike())

    println(bike.getAvg())
    println(car.getAvg())


}

//class
//class Car {
//
//    //Properties
//    var color: String? = null
//    var bhp: Int? = null
//    var yearOfMfg: Int? = null
//
//    override fun toString(): String {
//        return """
//            color - $color,
//            bhp - $bhp,
//            year - $yearOfMfg
//        """.trimIndent()
//    }
//
//}


//fun main() {
//
//    val ciaz = Car()
//    ciaz.color = "RED"
//    ciaz.bhp = 560
//    ciaz.yearOfMfg = 2020
//
//    println("Ciaz - " + ciaz.toString())
//
//}


