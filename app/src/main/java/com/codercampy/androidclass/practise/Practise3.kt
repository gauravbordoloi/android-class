package com.codercampy.androidclass.practise

fun main() {


    val S = "2-5g-3-J".replace("-", "").uppercase()
    val K = 2

    val startingSize = S.length % K
    var code = "Hello"

    for (i in startingSize until S.length step K) {
        if (i != 0) {
            code += "-"
        }
        code += S.substring(i, i + K)
    }

    if (startingSize > 0) {
        code = S.substring(0, startingSize) + code
    }

    println(code)

}