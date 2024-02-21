package com.codercampy.androidclass.operators

fun main() {

    /**
     * Artihmetic
     * Relation
     * Assignment
     */

    println("We will learn about operators here")

    /**
     * Relation
     * Always return boolean value
     * >
     * <
     * >=
     * <=
     * == (LHS = RHS)
     * != (LHS != RHS)
     */
//
//    val m1 = 5
//    val m2 = 10
//
//    var res = m1 > m2

//    val num1 = 5
//    val num2 = 10
//
//    println("> check ${num1 > num2}")
//    println("< check ${num1 < num2}")
//    println(">= check ${num1 >= num2}")
//    println("<= check ${num1 <= num2}")
//    println("== check ${num1 == num2}")
//    println("!= check ${num1 != num2}")

    /**
     * Assignment
     * +=
     * -=
     * *=
     * /=
     * %=
     */

    var m1 = 45
    var m2 = 5

    m1 %= 10

    println(m1)

//    val n1 = 327
//    val n2 = 6
//    var n3 = 15
//
//    n3 %= n1
//
//    println("value = $n3")

    /**
     * increment or decrement by 1
     * ++
     * --
     * Pre-Post
     */

    var a = 5
    println("A is ${++a}")
    println("A is ${a}")


//    var a1 = 5
//    a1--
//
//    println(a1)

    /**
     * Logical
     * Always return boolean value
     * AND &&
     * OR ||
     * NOT !
     */

    val b1 = 51
    val b2 = 10

    if (!(b1 == 5 && b2 == 10)) {
        println("OR test")
    }

    println("Input first number")
    val n1 = readln()

    println("Input second number")
    val n2 = readln()

    val sum = n1.toFloat() + n2.toFloat()

    println("Sum is $sum")
}