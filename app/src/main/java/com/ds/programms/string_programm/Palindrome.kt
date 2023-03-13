package com.ds.programms.string_programm

import android.annotation.SuppressLint

/**
 * Created by 1000292 on 19-11-2022
 * BFDL
 * PUNE.
 */

@SuppressLint("SuspiciousIndentation")
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