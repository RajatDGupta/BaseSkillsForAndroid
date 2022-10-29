package com.kotlin_programming.ds.queus

import java.util.*

/**
 * Created by 1000292 on 29-10-2022
 * BFDL
 * PUNE.
 */


fun main() {
    // Creating empty LinkedList
    // Creating empty LinkedList
    val ll: Queue<Int> = LinkedList()

    // Adding items to the ll
    // using add()

    // Adding items to the ll
    // using add()
    ll.add(10)
    ll.add(20)
    ll.add(15)
    println(ll)

    // Printing the top element of
    // the LinkedList

    // Printing the top element of
    // the LinkedList
    println(ll.peek()?:0)
    println(ll)


    // Printing the top element and removing it
    // from the LinkedList container

    // Printing the top element and removing it
    // from the LinkedList container
    println(ll.poll()?:0)
    println(ll)


    // Printing the top element again

    // Printing the top element again
    println(ll.peek()?:0)
    println(ll)


}