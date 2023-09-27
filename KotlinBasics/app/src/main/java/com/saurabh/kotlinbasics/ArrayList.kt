package com.saurabh.kotlinbasics

fun main()
{
    val arrList = arrayListOf<String>()     //Empty ArrayList
    arrList.add("One")
    arrList.add("Two")
    println("<<<<<<<<Print ArrayList>>>>>>>>")

    for(i in arrList)
    {
        print(i+" ")
    }

    // ArrayList using collections

    val arrList1:ArrayList<String> = ArrayList<String>(5)
    var list:MutableList<String> = mutableListOf<String>()
    list.add("Nine")
    list.add("Ten")
    list.add("Eight")
    arrList1.addAll(list)

    println("<<<<<<<<Print arrList1>>>>>>>>")

    val itr =arrList1.iterator()

    while(itr.hasNext())
    {
        println(itr.next())
    }
    println("size of arrList1 ${arrList1.size}")
    println()
    println(arrList1.get(1))
}