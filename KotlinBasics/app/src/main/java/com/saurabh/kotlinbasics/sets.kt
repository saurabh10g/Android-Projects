package com.saurabh.kotlinbasics

fun main()
{
    val fruits = setOf("apple","banana","Apple","grapes","apple")
    println(fruits.size)   //give 4
    println(fruits.toSortedSet())

    val newFruits = fruits.toMutableList()
    newFruits.add("Watermelon")
    newFruits.add("Mango")
    println(newFruits)

    println(newFruits.elementAt(4))
}
