package com.ds.programms.array_program

fun maxSubArray(arr: IntArray): Int {

    var current = arr[0]
    var max = arr[0]

    for (i in 1 until arr.size) {

        current = maxOf(arr[i], current + arr[i])

        max = maxOf(max, current)
    }

    return max
}