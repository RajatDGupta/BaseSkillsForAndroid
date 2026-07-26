package com.ds.programms.array_program

fun duplicates(arr: IntArray) {

    val set = mutableSetOf<Int>()

    for (num in arr) {
        if (!set.add(num))
            println(num)
    }
}