package com.ds.programms.collection

fun collectionsDemo() {

    val numbers = listOf(1,2,3,4,5,6)

    println(numbers.filter { it % 2 == 0 })

    println(numbers.map { it * it })

    println(numbers.groupBy { it % 2 == 0 })
}