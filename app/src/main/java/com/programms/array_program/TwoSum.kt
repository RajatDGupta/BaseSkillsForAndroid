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


fun twoSum(arr:IntArray,target:Int):Set<Pair<Int,Int>>{
    val pairList = mutableSetOf<Pair<Int,Int>>()
    for( i in 0 until arr.size){
        for( j in i+1 until arr.size){
            if(arr[i]+arr[j]==target){
                pairList.add(Pair(arr[i],arr[j]))
            }
        }
    }
    return pairList
}