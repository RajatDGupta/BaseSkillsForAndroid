package com.ds.programms.string_programm

import android.annotation.SuppressLint

fun main(){
  println(removeDuplicateChar("Programming"))
}

@SuppressLint("SuspiciousIndentation")
fun removeDuplicateChar(str:String):String{
val sb=StringBuilder()
    for(i in str.indices){
       val idx= str.indexOf(str[i],i+1)
         if(idx==-1){
            sb.append(str[i])
         }else{
            println(str[i])
         }
    }
    return sb.toString()
}