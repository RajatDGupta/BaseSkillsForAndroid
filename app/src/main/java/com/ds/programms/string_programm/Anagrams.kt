package com.ds.programms.string_programm

import java.util.*

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */
//How do you check if two strings are anagrams of each other?
// https://medium.com/javarevisited/top-21-string-programming-interview-questions-for-beginners-and-experienced-developers-56037048de45
fun isAnagram(x:String,y:String):Boolean{
    val a=x.toCharArray()
    val b=y.toCharArray()
    Arrays.sort(a)
    Arrays.sort(b)
    return a.contentEquals(b)
}

fun main() {
  println(isAnagram("AAA","AAA"))
}