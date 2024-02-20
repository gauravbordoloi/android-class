package com.codercampy.androidclass.ds.maps

//fun main() {
//
//    /**
//     * Map
//     * Key Value Pair
//     */
//
//    //First - Key
//    //2nd - Value
//    val map = mutableMapOf<String, Int>()
//
//    //set an item
//    map["purab"] = 100
//    map["pragyan"] = 525
//    map["gaurav"] = 25
//
//    println("Enter the username to find the follower")
//    val username = readln()
//
//    //Get an item
//    println("Followers of ${username} is ${map[username]}")
//    println(map)
//
//
//}

fun main() {

    val major = majorityElement(intArrayOf(2, 2, 1, 1, 1, 2, 2))
    println(major)

}

fun majorityElement(nums: IntArray): Int {

    val temp = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        if (temp[nums[i]] != null) {
            temp[nums[i]] = temp[nums[i]]!! + 1
        } else {
            temp[nums[i]] = 1
        }
    }

    println("Map - " + temp)

    val keys = temp.keys.toList()
    val values = temp.values.toList()

    println("Keys - ${keys}")
    println("Values - ${values}")

    for (i in 0 until temp.size) {
        if (values[i] > (nums.size / 2)) {
            return keys[i]
        }
    }
    return 0
}