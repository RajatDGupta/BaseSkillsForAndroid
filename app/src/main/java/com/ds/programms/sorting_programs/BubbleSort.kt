package com.ds.programms.sorting_programs

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 */


fun bubbleSort(arr: IntArray): IntArray {
    var swap = false
    for (i in arr.indices) {
        for (j in 0 until arr.size - 1 - i) {
            if (arr[j] > arr[j + 1]) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
                swap = true
            }
        }
        if (!swap) {
            break
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val list = bubbleSort(intArrayOf(2, 15, 1, 0, 8, 4, 0))
    for (k in list) print("$k ")
}