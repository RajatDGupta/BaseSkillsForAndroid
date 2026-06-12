    package com.ds.programms.array_program

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */



fun findMissingNo(arr: IntArray): Int {
    val n = arr.size
    val N=n+1
    val sum1 = ((N) * (N + 1)) / 2
    var sum2 = 0
    for (i in arr.indices) {
        sum2 += arr[i]
    }
    return sum1 - sum2
}


fun main() {
  println(findMissingNo(intArrayOf(1, 2, 3,5)))
}