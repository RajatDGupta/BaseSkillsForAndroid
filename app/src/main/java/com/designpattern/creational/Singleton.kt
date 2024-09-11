package com.designpattern.creational

/**
 * Created by 1000292 on 02-11-2022
 * BFDL
 * PUNE.
 */
object Singleton

/*
class Singleton private constructor() {

    companion object {

        @Volatile
         private var instance: Singleton? = null // Volatile modifier is necessary

        fun getInstance() =
            instance ?: synchronized(this) { // synchronized to avoid concurrency problem
                instance ?: Singleton().also { instance = it }
            }
    }
}*/

// href=https://medium.com/@ZahraHeydari/singleton-pattern-in-kotlin-b09380c53b14

/*class Singleton private constructor() {
    companion object {
        val INSTANCE: Singleton by lazy(LazyThreadSafetyMode.SYNCHRONIZED) { Singleton() }
    }
}*/
