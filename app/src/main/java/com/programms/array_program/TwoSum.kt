package com.programms.array_program

fun findAllPairs(nums: IntArray, target: Int): List<Pair<Int, Int>> {

    val result = mutableListOf<Pair<Int, Int>>()

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] + nums[j] == target) {
                result.add(Pair(nums[i], nums[j]))
            }
        }
    }

    return result
}