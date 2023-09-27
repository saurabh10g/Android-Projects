package com.saurabh.kotlinbasics

fun main()
{
//    var numbers:IntArray = intArrayOf(10,20,30,40,50)    similar to
//    var numbers = intArrayOf(10,20,30,40,50)            similar to
    var numbers = arrayOf(10,20,30,40,50)

    println(numbers)  //This will not give array as result, it will give address of array inside the memory
    println(numbers.contentToString())

    //To print element individually
    for(element in numbers)
    {
        println(element)
    }

    val fruits = arrayOf(Fruit("Apple",100.00),Fruit("Banana",50.00),Fruit("Watermelon",80.00))
    println(fruits.contentToString())
}

data class Fruit(val name:String,val price:Double)