package com.programms.array_program

fun moveZeroToEnd(arr: IntArray): IntArray {

    for (i in 0 until arr.size) {
        for (j in 0 until arr.size - 1) {
            if (arr[j] == 0) {
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }

    return arr
}

fun main() {
    val arr = intArrayOf(1, 0, 2, 0, 3)
    println(moveZeroToEnd(arr).joinToString())
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