package com.ds.programms.string_programm

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */
fun main() {
    println(reverseString("Hello"))
}

//How do you reverse a given string in place?
fun reverseString(inputString:String):String{
    var reverseString=""
    for(i in inputString.length-1 downTo 0)  {
        reverseString=reverseString.plus(inputString[i])
    }
   return reverseString
}