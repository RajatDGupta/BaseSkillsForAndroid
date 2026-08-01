package com.programms.pattern_programs

/**
 * Created by 1000292 on 11-10-2022
 * BFDL
 * PUNE.
 */

fun main() {
patternStar4()
}

/**
//
 *
 * *
 * * *
 * * * *
 * * * * *
//
 */
fun patternStar1(){
    val rows = 5
    for (i in 1..rows){
        for (j in 1..i){
            print("* ")
        }
        println()
    }
}


/**
//
 * * * * *
 * * * *
 * * *
 * *
 *
//
 */
fun patternStar2(){
    val rows = 5
    for (i in rows downTo 1){
        for (j in 1..i){
            print("* ")
        }
        println()
    }
}

/**
//
 * * * * *
   * * * *
     * * *
       * *
         *
//
 */
fun patternStar3(){
    val rows = 5
    var count =0
    for (i in rows downTo 1){
        for (j in 1..i){
            print("* ")
        }
        count++
        println()
        for (k in 1..count){
            print("  ")
        }
    }
}

/**
     *
   * *
 * * *

 */
fun patternStar4(){
    val rows = 5
    var count =0
    for (i in 1..rows){
        for (j in 1..rows-i){
            print("  ")
        }
        count++
        for (k in 1..count){
            print(" #")
        }
        println()
    }
}


/**
 *      *
 *     * *
 *    * * *
 *   * * * *
 *  * * * * *
 */
fun pyramid(){
    val rows = 5
    for (i in 1..rows){
        for(k in rows downTo i){
            print(" ")
        }
        for (j in 1..i){
            print("* ")
        }
        println()
    }
}
