package com.ds.queue

import java.util.*
import java.util.concurrent.PriorityBlockingQueue




fun main() {
    // Creating empty priority
    // blocking queue
    // Creating empty priority
    // blocking queue
    val pbq: Queue<Int> = PriorityBlockingQueue()

    // Adding items to the pbq
    // using add()

    // Adding items to the pbq
    // using add()
    pbq.add(10)
    pbq.add(20)
    pbq.add(15)

    // Printing the top element of
    // the PriorityBlockingQueue

    // Printing the top element of
    // the PriorityBlockingQueue
    println(pbq.peek()?:0)

    // Printing the top element and
    // removing it from the
    // PriorityBlockingQueue

    // Printing the top element and
    // removing it from the
    // PriorityBlockingQueue
    println(pbq.poll()?:0)

    // Printing the top element again

    // Printing the top element again
    println(pbq.peek()?:0)
}