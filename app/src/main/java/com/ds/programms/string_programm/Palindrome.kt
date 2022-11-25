package com.ds.programms.string_programm

/**
 * Created by 1000292 on 19-11-2022
 * BFDL
 * PUNE.
 */

fun palindrome(str: String):Boolean{
  var reverse=""
    (str.length-1 downTo 0).forEach { i ->
        reverse=reverse.plus(str[i])
    }
    return reverse == str
}

fun main() {
    println(palindrome("ABA"))
}