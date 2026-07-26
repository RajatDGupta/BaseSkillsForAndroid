package com.ds.programms.string_programm

fun reverseWords(str: String): String {
    return str.split(" ")
        .reversed()
        .joinToString(" ")
}