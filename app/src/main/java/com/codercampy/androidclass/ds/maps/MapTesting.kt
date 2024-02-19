package com.codercampy.androidclass.ds.maps

fun main() {

    /**
     * Map
     * Key Value Pair
     */

    //First - Key
    //2nd - Value
    val map = mutableMapOf<String, Int>()

    //set an item
    map["purab"] = 100
    map["pragyan"] = 525
    map["gaurav"] = 25

    println("Enter the username to find the follower")
    val username = readln()

    //Get an item
    println("Followers of ${username} is ${map[username]}")
    println(map)



}