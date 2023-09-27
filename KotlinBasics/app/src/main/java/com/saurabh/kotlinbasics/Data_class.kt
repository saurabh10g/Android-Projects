package com.saurabh.kotlinbasics

data class User(val id:Long,var name:String)  // data class must have atleast one parameter in the primary constructor
                                              // data class cannot be open,abstract or inner class
fun main()
{
    var obj = User(20110001,"Saurabh")
    obj.name="Vaibhav"
    var obj1 = User(20110001,"Vaibhav")

    println(obj==obj1) //True

    println("User Details: $obj") // As data class has toString Method
    println("\n")

    val updatedUser = obj.copy(name = "Apeksha")
    println(obj)
    println(updatedUser)
    println()

    println(updatedUser.component1()) //prints first component
    println(updatedUser.component2()) //prints second component
}