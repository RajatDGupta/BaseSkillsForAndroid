package com.kotlin_programming.ds.array

/**
 * Created by 1000292 on 02-11-2022
 * BFDL
 * PUNE.
 */
fun main() {
    // declaring an array using arrayOf()
    val arrayName = arrayOf(1, 2, 3, 4, 5)
    for (element in arrayName)
    {
        // declaring an array using arrayOf()
        println(" $element")
    }
    println()

    // declaring an array using arrayOf<Int>
    val arrayName2 = arrayOf<Int>(10, 20, 30, 40, 50)
    for (element in arrayName2)
    {
        println(" $element")
    }

    //using indices
    for (i in arrayName2.indices){
        println(" ${arrayName2.getOrNull(i)}")
    }

    //using repeat
    repeat(arrayName2.count()) {
        println(" ${it}")
    }
}