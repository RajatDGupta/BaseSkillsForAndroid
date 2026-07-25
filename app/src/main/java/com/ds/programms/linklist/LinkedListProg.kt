package com.ds.programms.linklist

import java.util.*

/**
 * Created by 1000292 on 29-10-2022
 * BFDL
 * PUNE.
 */

fun main() {
    val ll: LinkedList<String> = LinkedList()
    ll.add("A")
    ll.add("B")
    ll.add("A")
    ll.add("B")
    ll.add(1, "C")
    println(ll)

    //updating elements
    ll[1] = "D"
    println(ll)

    //remove elements
    ll.removeAt(1)
    ll.remove("A")

    //Iterating the LinkedList
    ll.forEach {
        print("$it ")
    }

    val iterator=ll.iterator()
    while (iterator.hasNext()){
        println(iterator.next())
    }
}

