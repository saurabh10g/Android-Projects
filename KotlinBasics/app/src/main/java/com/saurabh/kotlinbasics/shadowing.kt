package com.saurabh.kotlinbasics
var b = 3

fun main()
{
    meth(5)
}

//fun meth(a:Int)
//{
//    // a=5   Parameter can not be initiallized
//    var a = 4   // this is a variable and it is different from parameter a
//    println("The value of a is $a")  // This will give value of variable a not of parameter
//}

fun meth(a:Int) {
    b = a
    println("The value of a is $b")  //This will give the value of parameter
}