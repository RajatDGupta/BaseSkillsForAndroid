package com.solidprinciple

/**
 * Created by 1000292 on 24-08-2022
 * BFDL
 * PUNE.
 */

interface Charecter{
    fun getChar():Char
}

class ClassA:Charecter{
    override fun getChar():Char{
        return 'A'
    }
}

class ClassB:Charecter{
   override fun getChar():Char{
        return 'B'
    }
}

fun main() {
    mutableListOf(ClassA(),ClassB()).let {
        it.forEach {
            println(
                it.getChar()
            )
        }
    }
}