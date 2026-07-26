package com.ds.programms.missal

fun factorial(n: Int): Long {
    var fact = 1L

    for (i in 1..n)
        fact *= i

    return fact
}
