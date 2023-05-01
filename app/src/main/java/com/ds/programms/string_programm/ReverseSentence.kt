package com.ds.programms.string_programm

fun main(){
  println(reverseSentence("i like this program very much"))
}

fun reverseSentence(str:String):String{
    val arr=str.split(" ")
    val sb=StringBuffer()
    for (i in arr.size-1 downTo  0){
        sb.append(arr[i]).append(" ")
    }
     return sb.toString()
}