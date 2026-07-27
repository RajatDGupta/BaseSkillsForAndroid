package com.programms.string_programm

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) return ""

    var prefix = strs[0]

    for (i in 1 until strs.size) {
            while (!strs[i].startsWith(prefix)) {
            prefix = prefix.dropLast(1)

            if (prefix.isEmpty()) {
                return ""
            }
        }
    }

    return prefix
}

fun main() {
    val arr = arrayOf("flower", "flow", "flight")

    println(longestCommonPrefix(arr)) // Output: fl
}