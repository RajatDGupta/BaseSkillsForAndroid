package com.programms.array_program

fun rotate(arr: IntArray, k: Int): IntArray {

    val n = arr.size
    val result = IntArray(n)

    for (i in arr.indices) {
        result[(i + k) % n] = arr[i]
    }

    return result
}