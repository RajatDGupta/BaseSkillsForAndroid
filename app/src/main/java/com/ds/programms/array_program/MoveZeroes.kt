package com.ds.programms.array_program

fun moveZeroes(arr: IntArray) {

    var index = 0

    for (num in arr) {
        if (num != 0)
            arr[index++] = num
    }

    while (index < arr.size)
        arr[index++] = 0

    println(arr.joinToString())
}