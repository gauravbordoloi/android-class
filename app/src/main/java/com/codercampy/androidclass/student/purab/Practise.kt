package com.codercampy.androidclass.student.purab

//fun main() {
//    val num = intArrayOf(0, -1, 2, -3, 1)
//    val x = -2
//
//    var n = num.size
//    var t = false
//
//    for (i in 0 until n-1){
//        for (j in i+1 until n){
//           if (num[i] + num[j] == x){
//               t = true
//               break
//           }
//
//        }
//        if (t){
//            break
//        }
//    }
//    if (t){
//        println("Yes")
//    }else {
//        println("No")
//    }
//
//
//}
//

/**
 * Array Subset of another array
 *
 */

//
//fun main() {
//    val arr1 = intArrayOf(11, 7, 1, 13, 21, 3, 7, 3)
//    val arr2 = intArrayOf(11, 3, 7, 1, 7)
//
////    arr1.toList().containsAll(arr2.toList())
////
////    for (i in arr2.indices) {
////        if (!arr1.contains(arr2[i])) {
////            //false
////            break
////        }
////    }
////
//    //true
//
//
//
//    val map = mutableMapOf<Int, Boolean>()
//    arr2.forEach {
//        map[it] = false
//    }
//    for (i in arr1.indices) {
//        if (map [arr1[i]] != null){
//            map[arr1[i]] = true
//        }
//
//    }
//    var  isSubarray = true
//    val entries = map.entries.toList()
//
//    for (i in entries.indices){
//        if (!entries[i].value){
//            isSubarray = false
//            break
//        }
//
//    }
//if (isSubarray){
//    println("Is a subset")
//
//}else{
//    println("Is not a subset")
//}
//
//
//
//}


/**
 * Array contains duplicate numbers, find the duplicate numbers
// */
//
//fun main() {
//    val num1 = intArrayOf(2,3,4,5,6,7,2,34,5,6,7,5,4,1,2,3,5,6,7,8,9,3)
//    val map = mutableMapOf<Int, Int>()
//
//    for (i in num1.indices){
//        if (map[num1[i]] != null){
//            map[num1[i]] = map[num1[i]]!! + 1
//
//        } else {
//            map[num1[i]] = 1
//        }
//
//    }
//
//println(map)
//
//}


/**
 * Find the maximum difference between two array elements that satisfies the given constraints
 */

//fun main() {
//    val num = intArrayOf(2, 7, 9, 5, 1, 3, 5)
//    var maxDiff = 0
//
//    var pair: Pair<Int, Int>? = null
//    for (i in num.indices) {
//        for (j in i + 1 until num.size) {
//           if ( num[j] - num[i] > maxDiff){
//               pair = Pair(i, j)
//               maxDiff = num[j] - num[i]
//           }
//
//        }
//    }
//
//    println("The max difference is $maxDiff\n Pair is $pair")
//}
//


/**
 * https://codercampy.com/program-to-count-vowels-in-a-string-iterative-and-recursive/
 */

//fun main() {
//    println("Enter the word to find the vowels")
//    val word = readln().lowercase()
//
//    val vowel = mutableMapOf<Char, Int>()
//    vowel['a'] = 0
//    vowel['e'] = 0
//    vowel['i'] = 0
//    vowel['o'] = 0
//    vowel['u'] = 0
//
//    for( i in word.indices){
//        val v = vowel[word[i]]
//        if (v != null)
//            vowel[word[i]] = v + 1
//    }
//    println(vowel)
//    println(vowel.values.sum())
//}


/**
 * https://codercampy.com/length-of-last-word/
 */

//fun main() {
//    val str = "Hello Worlda"
//
//    var x = -1
//    for (i in str.length - 1 downTo 0) {
//        if (str[i] == ' ') {
//            x = i+1        //printf(str.length - 1 -i)
//            break
//        }
//    }
//
//    println("The word is : ${str.substring(x)} and the length is ${str.substring(x).length}")
//
//}

/*
https://codercampy.com/license-key-formatting/
 */

//fun main() {
//    val str = "5F3Z-2e-9-w".uppercase().replace("-", "")
//    val k = 4
//
//
////    for (i in str.length - 1 downTo 0) {
////        println(i)
////        if (i != str.length - 1 && (str.length - i) % k == 0) {
////            str1 = str.substring(i, i + k) + str1
////            if (i != 0) {
////                str1 = "-$str1"
////            }
////        } else if (i != str.length - 1 && ((str.length - i) % k) < k) {
////            println("aaa - " + str.substring(i, i + (str.length % k)))
////            str1 = str.substring(i, i + (str.length % k)) + str1
////        }
////    }
//
////    var i = str.length - k
////    while (i >= -k) {
////        if (i >= 0) {
////            str1 = "-" + str.substring(i, i + k) + str1
////        } else if (i + k > 0) {
////            str1 = "-" + str.substring(0, 0 + (str.length % k)) + str1
////        }
////        i -= k
////    }
////    if (str1.startsWith("-")) {
////        str1 = str1.substring(1)
////    }
////
////    println(str1)
//
//    val stringSize = str.length % k
//    var code = ""
//
//    for (i in stringSize until str.length step k) {
//        if (i != 0) {
//            code += "-"
//
//        }
//        code += str.substring(i, i + k)
//    }
//    if (stringSize > 0) {
//        code = str.substring(0, stringSize) + code
//    }
//
//    println(code)
//
//
//}

fun main() {
    val petName = "dog cat cat fish".split(" ")
    val p = "abba"

    val map = mutableMapOf<Char, String>()
    var m = true

    for (i in 0 until petName.size){
        if (map[p[i]] == null){
            map[p[i]] = petName[i]
        }else{
            if (petName[i] != map[p[i]]){
                m = false
             break
            }
        }
    }

        println(m)
}