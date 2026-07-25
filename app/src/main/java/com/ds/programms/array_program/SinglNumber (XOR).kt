package com.ds.programms.array_program

fun singleNumber(arr: IntArray): Int {

    var result = 0

    for (num in arr)
        result = result xor num

    return result
}