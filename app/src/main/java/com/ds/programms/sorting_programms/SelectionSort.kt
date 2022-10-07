package com.ds.programms.sorting_programms

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 * ref= https://medium.com/@vamsitallapudi/selection-sort-kotlin-with-example-sorting-algorithms-1-e01008ccc979
 */



fun selectionSort(arr: IntArray):IntArray{
    var min:Int
    for (i in arr.indices) {
        min = i
        for (j in (i + 1) until arr.size) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        val temp = arr[min]
        arr[min] = arr[i]
        arr[i] = temp
    }
    return arr
}

fun main() {
    val list = selectionSort(intArrayOf(2, 15, 1, 0, 8, 4,0,200,-1))
    for (k in list) print("$k ")
}