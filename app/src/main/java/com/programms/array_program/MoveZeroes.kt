package com.ds.programms.array_program

fun moveZeroes(arr: IntArray) {
    var left = 0

    for (right in arr.indices) {
        if (arr[right] != 0) {
            val temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp
            left++
        }
    }

    println(arr.joinToString())
}



/*
*
*
* [0,1,0,3,12]

left=0 right=0 -> skip

left=0 right=1
swap(0,1)

[1,0,0,3,12]

left=1 right=2
skip

left=1 right=3
swap(1,3)

[1,3,0,0,12]

left=2 right=4
swap(2,4)

[1,3,12,0,0]
*
* */