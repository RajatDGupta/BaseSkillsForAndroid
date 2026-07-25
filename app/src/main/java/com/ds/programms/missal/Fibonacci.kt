package com.ds.programms.missal

fun fibonacci(number:Int){
    var t1 = 0
    var t2 = 1
    for (index in 1..number) {
        val sum = t1 + t2
        t1 = t2
        t2 = sum
        print(t2)
    }
}

fun fibonacci2(n: Int) {
    var a = 0
    var b = 1

    repeat(n) {
        print("$a ")
        val temp = a + b
        a = b
        b = temp
    }
}