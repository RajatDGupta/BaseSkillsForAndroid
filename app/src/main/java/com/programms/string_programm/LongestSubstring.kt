package com.ds.programms.string_programm



// Longest Substring Without Repeating Characters
fun lengthOfLongestSubstring(s: String): Int {

    val set = HashSet<Char>()

    var left = 0
    var max = 0

    for (right in s.indices) {

        while (set.contains(s[right])) {
            set.remove(s[left])
            left++
        }

        set.add(s[right])

        max = maxOf(max, right - left + 1)
    }

    return max
}