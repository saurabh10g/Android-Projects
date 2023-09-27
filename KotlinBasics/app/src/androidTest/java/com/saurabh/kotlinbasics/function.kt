package com.saurabh.kotlinbasics

fun main()
{
    myfun()
    println(addup(10,99))
}

fun myfun()
{
    println("I am a Function.")
}

fun addup(a:Int,b:Int):Int{
    return a+b
}
