package com.ds.programms.missal

/**
 * Created by 1000292 on 01-02-2023
 * BFDL
 * PUNE.
 */

fun main(){
println(fibonacci(7))
}


// Display Fibonacci series using for loop
fun fibonacci(number:Int){
    var t1 = 0
    var t2 = 1
    for (index in 1..number) {
        val sum = t1 + t2
        t1 = t2
        t2 = sum
        print(t2)
    }
}



//4. Write a Java program to check if the given number is a prime number.
fun isPrimeNo(num:Int):Boolean{
    var isPrime=true
    for (i in 2..num/2){
       if(num%i==0){
           isPrime=false
       }
       if(isPrime){
           break
       }
    }
    return isPrime
}

//Write a Java program to check if a vowel is present in a string.

fun vowelPresent(str:String): Boolean {
    var isVowelPresent=false
    for(i in str.indices){
        when(str[i]){
            'a','e','i','o','u','A','E','I','O','U'-> {
                isVowelPresent=true
            }
        }
        if(isVowelPresent){
            break
        }
    }
    return isVowelPresent
}

fun swapNumber(){
    var a=10
    var b=20
    a += b
    b= a-b
    a -= b
    print("$a $b")
}