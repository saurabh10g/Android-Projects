package com.saurabh.kotlinbasics

class car()
{
    lateinit var owner:String   // use to initiallize variable later in init block

    val brand : String = "BMW"
        get()                 // Custom getter
        {
            return field.toLowerCase()
        }

    var maxSpeed:Int = 250
   // get() = field   It is defualt
    set(value)
    {
        field = if(value>0)value else throw IllegalArgumentException("Maximum Speed Cannot Be Less Than Zero.")
    }

    var myModel:String="M5"
    private set

    init {
        this.myModel = "M3"
        this.owner = "Saurabh"
    }
}

fun main()
{
    var obj = car()
    println("Owner is ${obj.owner}")
    println("brand is ${obj.brand}")
    obj.maxSpeed =-132
    println("Maximum speed is ${obj.maxSpeed}")
//    obj.myModel="M3"          Can't do as setter is made private , It can be changed only within the class
    println("Model is ${obj.myModel}")   // It can be done as gettter is not made private
}