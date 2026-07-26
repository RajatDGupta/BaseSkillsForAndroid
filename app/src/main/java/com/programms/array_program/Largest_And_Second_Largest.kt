package com.programms.array_program

fun secondLargest(arr: IntArray): Int {

    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (num in arr) {

        if (num > first) {
            second = first
            first = num
        } else if (num > second && num != first) {
            second = num
        }
    }

    return second
}