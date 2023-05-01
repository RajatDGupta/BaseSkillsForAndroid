package com.ds.programms.string_programm

fun main(){
    sortString("neeraj")
}

fun sortString(str:String){
   val arr=str.toCharArray()
   for(i in arr.indices){
      for (j in 0 until arr.size-1-i){
         if(arr[j]>arr[j+1]){
            val temp=arr[j]
            arr[j]=arr[j+1]
            arr[j+1]=temp
         }
      }
   }
   for(item in arr){
      println(item)
   }
}