package com.programms.array_program

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */



fun missingNumber(arr: IntArray): Int {

    val n = arr.size + 1

    val total = n * (n + 1) / 2

    return total - arr.sum()
}


fun main() {
  println(missingNumber(intArrayOf(1, 2, 3,5)))
}