// Nested class is static by default

package com.saurabh.kotlinbasics

//Inner class is a nested class with "inner" keyword
class outerClass
{
    private var name:String = "MR.X"

    inner class innerClass
    {
        var description:String = "Code inside inner class"
        private var id:Int =101
        fun foo()
        {
            println("Name is $name")   //name will not be available in nested classes
            println("ID is $id")
        }
    }
}

fun main() {
    println(outerClass().innerClass().description)
    var obj = outerClass().innerClass()
    obj.foo()
}