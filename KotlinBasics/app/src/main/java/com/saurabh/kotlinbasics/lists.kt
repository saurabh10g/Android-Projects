package com.saurabh.kotlinbasics

fun main()
{
    val months = listOf("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug")
    val list = listOf(1,2,2.03,true,"Saurabh")
    println(list.size)
    println(months[4])

    for(element in months)
    {
        println(element)
    }
    println()

    //List are immutable you can't add elements to it directly

    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("Sept","Oct","Nov")
    additionalMonths.addAll(newMonths)
    println(additionalMonths)
    additionalMonths.add("Dec")
    println(additionalMonths)

    //we can also create mutable list
    val days = mutableListOf<String>("Mon","Tue","Wed")
    days.add("Thur")
    println(days)
    days[2]="Wednesday"
    println(days)
    days.removeAt(3)
    println(days)
    days.removeAll(days)
    println(days)

}