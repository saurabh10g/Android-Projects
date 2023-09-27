//Lambda is a function which has no name

package com.saurabh.kotlinbasics

fun main() {
    add(10,20)
    println(sum(100,200))
    sum1(1000,2000)
}

//Normal Function for addition of two numbers
fun add(a:Int,b:Int)
{
    val add = a+b
    println(add)
}

//Lambda expression for addition of two numbers
val sum : (Int,Int)->Int = {a:Int,b:Int -> a+b}  // 1 = This will return the addition.
val sum1 = {a:Int,b:Int -> println(a+b)}         // 2 = This will print the addition.

