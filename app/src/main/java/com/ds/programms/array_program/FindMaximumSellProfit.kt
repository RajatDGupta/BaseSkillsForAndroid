package com.ds.programms.array_program

import kotlin.math.max
import kotlin.math.min

fun main() {
println(findMaximumProfit(intArrayOf(200,23,233,24)))
}

fun findMaximumProfit(stockPrices:IntArray):Int{
    var minimumPrice = Int.MAX_VALUE
    var maxProfit = 0

    /*
         * The profit is the maximum value of the maximumProfit so far and
         * the difference between the current element(selling price) and the minimum buying price - i.e. profit for that buy
         * Profit = current selling price - the minimum buying price
         *
         * Minimum buying price is the minimum value between the current element and the minimum price
         * */

    for (i in stockPrices.indices) {
        maxProfit = max(maxProfit, stockPrices[i] - minimumPrice)
        minimumPrice = min(minimumPrice, stockPrices[i])
    }

    return maxProfit
}