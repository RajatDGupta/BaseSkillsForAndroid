package com.programms.string_programm


fun main(){
    println(removeSpecialChar("jcjndbkjdbkj8i%&^(*dlksdkl"))
}

fun removeSpecialChar(str:String):String{
    return str.replace(Regex("[^A-Za-z0-9 ]"),"")
}