package com.ds.programms.sorting_programs


fun main(arr: Array<String>) {
    sortArrays(intArrayOf(1, 4, 2, -1, 6, 5)).forEach {
        print(it)
    }
}

fun sortArrays(arr: IntArray): IntArray {

    // Finding the length of array 'arr'
    val length = arr.size

    // Sorting using a single loop
    var j = 0
    while (j < length - 1) {


        // Checking the condition for two
        // simultaneous elements of the array
        if (arr[j] > arr[j + 1]) {

            // Swapping the elements.
            val temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp

            // updating the value of j = -1
            // so after getting updated for j++
            // in the loop it becomes 0 and
            // the loop begins from the start.
            j = -1
        }
        j++
    }
    return arr
}
