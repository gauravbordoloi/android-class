package com.codercampy.androidclass.ds.arrays

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in
 * the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * Example 1:
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * Example 2:
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 */

fun main() {

//    val prices = arrayOf(7, 19, 5, 3, 6, 4, 100)
//
//    //Loop prices
//    //find the index of minimum value (min)
//    //find the index of maximum value (max)
//    //if (max > min) Output = prices[max] - prices[min]
//    //else -> 0
//
//    var maxProfit = 0
//
//    for (i in prices.indices) { // main loop
//        // i = 0, i = 1
//
//        for (j in i + 1 until prices.size) {
//            //j = 1, j = 2
//            if ((prices[j] - prices[i]) > maxProfit) {
//                //1st run => 7
//                //2nd run => 5 - 1
//                maxProfit = prices[j] - prices[i]
//            }
//        }
//
//    }
//
//    println("Max Profit is $maxProfit")



    val prices = arrayOf(7,1,5,3,6,4)

    var minIndex = 0
    for (i in prices.indices) { // main loop

        if (prices[i] < prices[minIndex]) {
            println("Setting min index at $i")
            minIndex = i
        }
    }

    var maxIndex = minIndex
    for (i in (minIndex + 1) until prices.size) { // main loop
        println("i - $i")
        if (prices[i] > prices[maxIndex]) {
            println("Setting max index at $i")
            maxIndex = i
        }
    }

    val maxProfit = prices[maxIndex] - prices[minIndex]

    println("Max Profit is $maxProfit")

}