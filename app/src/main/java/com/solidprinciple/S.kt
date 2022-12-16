package com.solidprinciple

/**
 * Created by 1000292 on 23-08-2022
 * BFDL
 * PUNE.
 */

/**
   Single Responsibility principle
   The Single responsibility Principle states that every
   class should have one and only one responsibility. In other words,
   If there is a need to change the class for more than one reason then
   that defies the single responsibility principle.
 */


class A{
    fun getChar():Char{
        return 'A'
    }
}

class B{
    fun getChar():Char{
         return 'B'
    }
}

fun main() {
    println(A().getChar().toString())
    println(B().getChar().toString())
}




