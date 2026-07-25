package com.ds.programms.array_program

fun merge(a: IntArray, b: IntArray): IntArray {
    return (a + b).sorted().toIntArray()
}