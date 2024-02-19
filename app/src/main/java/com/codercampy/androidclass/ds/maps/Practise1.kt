package com.codercampy.androidclass.ds.maps

fun main() {

    /**
     *
     * Find the duplicates count of an array
     *
     */

    val arr = arrayOf(1, 3, 7, 2, 7, 1, 3, 8, 9, 9, 100, 8, 100, 3, 9, 9)
    val map = mutableMapOf<Int, Int>()

    for (i in arr.indices) {
        val c = map[arr[i]]
        if (c != null) {
            map[arr[i]] = c + 1
        } else {
            map[arr[i]] = 1
        }
    }

    println(map)

    /**
     * Pragyan - Meteor, Hayabusa, Xpulse
     * Purab -
     *
     *
     */

    /**
     * Meteor,
     * Hayabusa,
     * Xpulse
     * Meteor,
     * Hayabus
     */

    /**
     * Group the bikes according to their owner
     */

    val map2 = mutableMapOf<String, List<String>>()

    map2["gaurav"] = listOf("hayabusa", "Enfield", "Etc")
    map2["purab"] = listOf("ciaz", "bmw", "aaaaaaa")

    println(map2)

    map2.forEach {
        println("Key - ${it.key}, Value - ${it.value}")
    }

}