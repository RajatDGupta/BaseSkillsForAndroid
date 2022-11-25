package com.ds.programms.string_programm

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */
fun main() {
   // findDuplicateChar("Hello")

println(converterCamelCase("aadasdFhgHkj")
)
}

//How do you print duplicate characters from a string?
fun findDuplicateChar(str: String) {
    val map = mutableMapOf<String, Int>()
    for (i in str.indices) {
        if (map.containsKey(str[i].toString())) {
            map[str[i].toString()] = map[str[i].toString()]!! + 1
        } else {
            map[str[i].toString()] = 1
        }
    }
    for (key in map.keys) {
        if (map[key]!! > 1) {
            println(key)
        }
    }
}

fun converterCamelCase(original: String): Int {
    val lista = mutableListOf<String>()
    val sb = StringBuilder()
    for (i in original.indices) {
        if (!Character.isUpperCase(original[i])) { //If it has a lowercase letter
            sb.append(original[i])
        } else {
            val c = original[i].lowercaseChar()
            break
        }
    }
    lista.add(sb.toString())
    return lista.size
}