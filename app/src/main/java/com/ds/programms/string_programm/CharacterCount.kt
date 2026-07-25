package com.ds.programms.string_programm

fun countCharacters(str: String) {

    str.groupingBy { it }
        .eachCount()
        .forEach(::println)
}