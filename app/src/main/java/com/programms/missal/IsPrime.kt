package com.ds.programms.missal

import kotlin.math.sqrt

fun isPrime(n: Int): Boolean {
    if (n <= 1) return false

    for (i in 2..sqrt(n.toDouble()).toInt()) {
        if (n % i == 0)
            return false
    }
    return true
}