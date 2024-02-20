package com.codercampy.androidclass.ds.lists

fun main() {

    /**
     * Lists
     */

    val list = mutableListOf<Int>()

    //Add an item to the last position
    list.add(50)

    list.add(25)

    //At item at an specified index
    list.add(1, 1000)

    for (i in 0 until 10) {
        list.add(i * 10)
    }

    //remove an item
    list.remove(1000)

    //remove an item at a particular index
    list.removeAt(5)

    //Remove multiple items
    list.removeAll(listOf(10, 20, 30))

    list.addAll(listOf(1, 2, 3, 4, 5))

    //Remove all items
    //list.clear()

    //Check if the list contains an item
    println("Does the list contains 90 ? Ans - ${list.contains(90)}")

    println("The size of the list is ${list.size}")
    println("The list is $list")

    list.forEachIndexed { index, i ->
        println("Elemennt at $index is $i")
    }


    val list1 = mutableListOf(55, 65, 75)
    println("list1 - " + list1)

    println("Enter the number to remove")
    val numberToRemove  = readln().toInt()

    list1.remove(numberToRemove)
    println("list1 - " + list1)

}