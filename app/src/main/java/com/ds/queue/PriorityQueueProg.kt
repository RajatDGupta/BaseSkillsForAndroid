package com.ds.queue

import java.util.*

/**
 * Created by 1000292 on 29-10-2022
 * BFDL
 * PUNE.
 */

fun main() {
    // Creating empty priority queue
    // Creating empty priority queue
    val pQueue: Queue<Int> = PriorityQueue()

    // Adding items to the pQueue
    // using add()

    // Adding items to the pQueue
    // using add()
    pQueue.add(10)
    pQueue.add(20)
    pQueue.add(15)

    // Printing the top element of
    // the PriorityQueue
    println(pQueue)

    // Printing the top element of
    // the PriorityQueue
    println(pQueue.peek()?:0)
    println(pQueue)


    // Printing the top element and removing it
    // from the PriorityQueue container

    // Printing the top element and removing it
    // from the PriorityQueue container
    println(pQueue.poll()?:0)
    println(pQueue)


    // Printing the top element again

    // Printing the top element again
    println(pQueue.peek()?:0)
    println(pQueue)

}