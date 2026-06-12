package com.designpattern.creational

data class User(
    val name: String,
    val age: Int
)

fun main(){
    val user1 = User("Neeraj", 25)

    val user2 = user1.copy(age = 26)
}