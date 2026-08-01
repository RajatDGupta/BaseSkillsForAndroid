package com.programms.string_programm

fun countVowels(str: String): Int {

    return str.count {
        it.lowercaseChar() in "aeiou"
    }
}