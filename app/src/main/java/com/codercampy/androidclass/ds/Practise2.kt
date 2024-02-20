package com.codercampy.androidclass.ds

fun main() {

    //haystack=jewgfjerwoigjsadbutsad
    //needle=sad


    println("sadbutsad".indexOf("sad"))

}

fun strStr(haystack: String, needle: String): Int {

    for (i in haystack.indices) {

        if (haystack[i] == needle[0]) {
            var matched = true
            for (j in 1 until needle.length) {
                if ((i + j >= haystack.length) || haystack[i + j] != needle[j]) {
                    matched = false
                    break
                }
            }
            if (matched) {
                return i
            }
        }

    }

    return -1
}