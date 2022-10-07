package com.ds.programms.sorting_programms

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 */

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

fun main(array: Array<String>) {
    val list = insertionSort(intArrayOf(2, 15, 1, 0, 8, 4,0,-1))
    for (k in list) print("$k ")
}