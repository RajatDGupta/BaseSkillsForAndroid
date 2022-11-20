package com.ds.programms.sorting_programs

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 * ref= https://medium.com/@vamsitallapudi/selection-sort-kotlin-with-example-sorting-algorithms-1-e01008ccc979
 */

//https://www.youtube.com/watch?v=GRNOoZeV6xc&list=PLlhM4lkb2sEgQ2nI2bsrKx5qIOAb7S7sc&index=2

fun selectionSort(arr: IntArray):IntArray{
    var min:Int
    for (i in arr.indices) {
        min = i
        for (j in (i + 1) until arr.size) {
            if (arr[j] < arr[min]) {
                min = j
            }
        }
        val temp = arr[i]
        arr[i] = arr[min]
        arr[min]=temp
    }
    return arr
}

fun main() {
    val list = selectionSort(intArrayOf(2, 15, 1, 0, 8, 4,0,200,-1))
    for (k in list) print("$k ")
}