package com.ds.programms.string_programm

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Created by 1000292 on 20-11-2022
 * BFDL
 * PUNE.
 */
fun main() {
   // findDuplicateChar("Hello")

println(findDuplicateChar("aadasdFhgHkj")
)
}

//How do you print duplicate characters from a string?
fun findDuplicateChar(str: String) {
    val map = mutableMapOf<Char, Int>()
    for (i in str.indices) {
        if (map.containsKey(str[i])) {
            map[str[i]] = map[str[i]]!! + 1
        } else {
            map[str[i]] = 1
        }
    }
    for (key in map.keys) {
        if (map[key]!! > 1) {
            println(key)
        }
    }

    /*val map = "Hello World".groupingBy { it }.eachCount()
    print(map)*/
}


@RequiresApi(Build.VERSION_CODES.N)
fun frequency(str: String) {
    val map = mutableMapOf<Char, Int>()

    for (c in str) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    println(map)
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