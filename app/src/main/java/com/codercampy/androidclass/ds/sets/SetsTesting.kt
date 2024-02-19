package com.codercampy.androidclass.ds.sets

fun main() {

    /**
     * Sets
     * Always contains unique elements
     */

    val set = mutableSetOf<Int>()

    //Add an item
    set.add(5)

    set.add(6)

    set.add(100)

    //Always contains unique value
    set.add(5)
    set.add(5)

    //Size
    set.size

    //remove an item
    set.remove(5)

    //clear
    //set.clear()

    //Check if an item exists in the set
    set.contains(5)

    println("The set is ${set.joinToString()}")

}