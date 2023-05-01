package com.ds.programms.string_programm

fun main(){
    println(removeWhiteSpace("  jcjnd bkjdbkj8i%&^(  *dlksdkl  "))
}

fun removeWhiteSpace(str:String):String{
    return str.replace(Regex("\\s"),"")
}