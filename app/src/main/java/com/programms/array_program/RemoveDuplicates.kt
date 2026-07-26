package com.programms.array_program

fun removeDuplicates(arr: IntArray): List<Int> {
    val set = mutableSetOf<Int>()

    for (num in arr) {
        set.add(num)
    }

    return set.toList()
}

fun main() {
    val arr = intArrayOf(3, 1, 2, 1, 4, 2, 5)
    println(removeDuplicates(arr))
}