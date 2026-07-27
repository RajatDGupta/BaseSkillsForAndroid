package com.ds.programms.sorting_programs

/**
 * Created by 1000292 on 12-08-2022
 * BFDL
 * PUNE.
 */

// https://www.youtube.com/watch?v=v6hmmfIiKu4&list=PLlhM4lkb2sEgQ2nI2bsrKx5qIOAb7S7sc&index=1

fun bubbleSort(arr: IntArray): IntArray {
    for (i in 0 until arr.size) {
        var flag=0
        for (j in 0 until arr.size - 1) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                    flag=1
                }
        }
        if (flag==0) {
            break
        }
    }
    return arr
}

fun main(args: Array<String>) {
    val list = bubbleSort(intArrayOf(2, 15, 1, 0, 8, 4, 0))
    for (k in list) print("$k ")
}

/**
Original
2 15 1 0 8 4 0

i = 0
2 15 1 0 8 4 0
2 1 15 0 8 4 0
2 1 0 15 8 4 0
2 1 0 8 15 4 0
2 1 0 8 4 15 0
2 1 0 8 4 0 15

i = 1
1 2 0 8 4 0 15
1 0 2 8 4 0 15
1 0 2 8 4 0 15
1 0 2 4 8 0 15
1 0 2 4 0 8 15

i = 2
0 1 2 4 0 8 15
0 1 2 4 0 8 15
0 1 2 4 0 8 15
0 1 2 0 4 8 15

i = 3
0 1 2 0 4 8 15
0 1 2 0 4 8 15
0 1 0 2 4 8 15

i = 4
0 1 0 2 4 8 15
0 0 1 2 4 8 15

i = 5
0 0 1 2 4 8 15

i = 6
0 0 1 2 4 8 15
 */
