package com.saurabh.kotlinbasics

//class Person constructor(firstName : String , lastName : String)
//class Person (firstName: String , lastName : String)
//class Person (firstName: String = "Apeksha" , lastName : String = "Gadhave")
//{
//    init {
//        println("Person created with name ${firstName lastName}")   // Initializer Block
//    }
//}
//
//fun main()
//{
//    var obj1 = Person("Saurabh","Gadhave")
//    println()
//    var obj2 = Person()
//    println()
//    var obj3 = Person("Ankita")
//    println()
//    var obj4 = Person(lastName = "Gaykar")
//}

class MobilePhone constructor(osName:String,brand:String,model:String)
{
    init{
        println("OS:$osName ,\n Brand:$brand , \n Model:$model \n")
    }
}

fun main()
{
    var Samsung = MobilePhone("Android","Samsung","Galaxy S20 Ultra")
    var Apple = MobilePhone("MacOS","Apple","iPhone 13 pro max")
    var Google = MobilePhone("Android","Google","Pixel 6a")
}