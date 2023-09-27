package com.saurabh.kotlinbasics

fun main()
{
    val days = mapOf(1 to "Monday",2 to "Tuesday",3 to "Wednesday")
    println(days[2])

    for(key in days.keys)
    {
        println("$key is to ${days[key]}")
    }

    println()

    val fruitsMap = mapOf("GOOD" to Fruits("grapes",120.0),"BETTER" to Fruits("Orange",70.00),"BEST" to Fruits("Mango",160.00))

    val newDays = days.toMutableMap()
    newDays[4]="Thursday"
    print(newDays.toSortedMap())
}

data class Fruits(val name:String,val price:Double)