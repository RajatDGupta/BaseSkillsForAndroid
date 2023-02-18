package com.ds.programms.string_programm

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */
fun main() {
    println(reverseString_("Hello"))
}

//How do you reverse a given string in place?
fun reverseString(inputString:String):String{
    var reverseString=""
    for(i in inputString.length-1 downTo 0)  {
        reverseString=reverseString.plus(inputString[i])
    }
   return reverseString
}

// recursion
fun reverseStringRecursion(inputString:String):String{
    if(inputString.isEmpty() && inputString.length<=1) return inputString
    return reverseStringRecursion(inputString.substring(1))+inputString[0]
}


fun reverseString_(string: String):String{
    val stringBuilder=StringBuilder()
  for(i in string.length-1 downTo 0){
      stringBuilder.append(string[i])
  }
  return stringBuilder.toString()
}