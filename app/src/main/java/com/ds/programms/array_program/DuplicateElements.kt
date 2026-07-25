package com.ds.programms.array_program

fun duplicates(arr: IntArray) {

    val set = HashSet<Int>()

    for (num in arr) {
        if (!set.add(num))
            println(num)
    }
}