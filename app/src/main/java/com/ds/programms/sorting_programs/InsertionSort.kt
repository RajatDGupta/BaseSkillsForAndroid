package com.ds.programms.sorting_programs

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 */

// https://www.youtube.com/watch?v=f-f50FjS_jA&list=PLlhM4lkb2sEgQ2nI2bsrKx5qIOAb7S7sc&index=3
// intArrayOf(2, 15, 1, 0, 8, 4,0,-1)

/*
fun insertionSort(arr: IntArray): IntArray{
    var temp:Int
    var j:Int
    for (i in 1 until arr.size){
        temp = arr[i]
        j = i - 1
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j]
            j -=  1
        }
        arr[j + 1] = temp
    }
    return arr
}
*/

fun insertionSort(arr: IntArray): IntArray{
    var temp:Int
    var j:Int
    for (i in 1..arr.size){
        temp = arr[i]
        j=i
        while (j > 0 && arr[j-1] > temp) {
            arr[j] = arr[j-1]
            j -=  1
        }
        arr[j] = temp
    }
    return arr
}

fun main(array: Array<String>) {
    val list = insertionSort(intArrayOf(2, 15, 1, 0, 8, 4,0,-1))
    for (k in list) print("$k ")
}