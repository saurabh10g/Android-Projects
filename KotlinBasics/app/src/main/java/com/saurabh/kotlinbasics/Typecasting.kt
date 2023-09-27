package com.saurabh.kotlinbasics

fun main()
{
    val stringList:List<String> = listOf("Saurabh","Vaibhav","Vishal")
    val anyList:List<Any> = listOf("Apekha",31,"Vaishali",43.00,"ankita")

//    for(value in anyList)
//    {
//        if(value is Int)
//            println("Integer: $value")
//        else if(value is Double)
//            println("Double: $value with double ${Math.floor(value)}")
//        else if(value is String)
//            println("String: $value with length ${value.length}")
//        else
//            println("Unknown Type")
//    }

    // In Simpler Way
    for(value in anyList)
    {
        when(value)
        {
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value with double ${Math.floor(value)}")
            is String -> println("String: $value with length ${value.length}")
            else -> println("Unknown Type")
        }
    }

    //Smart cast
    var obj:Any = "I am Saurabh"
    if(obj !is String)
        println("Not a string.")
    else
        println("Found a string of length ${obj.length}")   //Object is automatically casted to a string in this scope

    //Explicit (unsafe) casting using 'as' keyword - can go wrong
//    val str:String = obj as String
//    println(obj.length)

//    val obj1:Any =1322
//    val str1:String = obj1 as String   //will gives error
//    println(str1)

    //Explicit (safe) casting using 'as?' keyword
    val obj2:Any =1324
    val str2:String? = obj2 as? String //works.   Here str2 is nullable
    println(str2)  //prints null
}