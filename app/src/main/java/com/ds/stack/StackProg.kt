package com.ds.stack

import java.util.*

/**
 * Created by 1000292 on 29-10-2022
 * BFDL
 * PUNE.
 */
object StackProg {
    // Pushing element on the top of the stack
    fun stackPush(stack: Stack<Int>) {
        for (i in 0..4) {
            stack.push(i)
        }
    }

    // Popping element from the top of the stack
    fun stackPop(stack: Stack<Int>) {
        println("Pop Operation:")
        for (i in 0..4) {
            println(stack.pop())
        }
    }

    // Displaying element on the top of the stack
    fun stackPeek(stack: Stack<Int>) {
        val element = stack.peek() as Int
        println("Element on stack top: $element")
    }

    // Searching element in the stack
    fun stackSearch(stack: Stack<Int>, element: Int) {
        val pos = stack.search(element)
        if (pos == -1) println("Element not found") else println("Element is found at position: $pos")
    }
}

fun main() {
    val stack = Stack<Int>()
    StackProg.stackPush(stack)
    StackProg.stackPop(stack)
    StackProg.stackPush(stack)
    StackProg.stackPeek(stack)
    StackProg.stackSearch(stack, 2)
    StackProg.stackSearch(stack, 6)
}