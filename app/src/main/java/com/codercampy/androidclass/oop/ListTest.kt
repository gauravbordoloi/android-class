package com.codercampy.androidclass.oop

class Student1  {

    var name: String? = null
    var marks: Int? = null
    var dob: Int = 0

    constructor() {

    }

    constructor(aaa: Int) {

    }

    constructor(name: String?, marks: Int?, dob: Int) {
        this.name = name
        this.marks = marks
        this.dob = dob
    }

}

data class Student(
    val name: String,
    val marks: Int,
    val dob: Int = 0
)

fun main() {

//    val lion = Animal("Lion")
//    println(lion.name)


    println("Collect data of 5 students")

    val students = mutableListOf<Student>()

    for (i in 0 until 5) {
        println("ENter the name")
        val name = readln()

        println("Enter the marks")
        val marks = readln().toInt()

        println("Enter the DOB Year")
        val yr = readln().toInt()

        val s = Student(
            marks = marks,
            name = name,
            dob = yr
        )

        students.add(s)
    }

    println("All the students are ${students}")

}
