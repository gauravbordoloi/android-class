package com.codercampy.androidclass.ds

/**
 * https://leetcode.com/problems/roman-to-integer/description/
 */

fun main() {

    println(romanToInt("MMMDCCXXIV"))

}

fun romanToInt(s: String): Int {

    var sum = 0
    for (i in s.indices) {
        val tPrev = if (i > 0) {
            getNumericValueFromRoman(s[i - 1])
        } else {
            null
        }
        val tNext = if (i < s.length - 1) {
            getNumericValueFromRoman(s[i + 1])
        } else {
            0
        }
        val t = getNumericValueFromRoman(s[i])
        println("""
            tPrev - $tPrev,
            t - $t,
            tNext - $tNext,
        """.trimIndent())

        if (tPrev != null && tPrev < t) {
            continue
        } else if (tNext > t) {
            sum += (tNext - t)
        } else {
            sum += t
        }
    }

    return sum
}

fun getNumericValueFromRoman(s: Char): Int {
    return when (s) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
}