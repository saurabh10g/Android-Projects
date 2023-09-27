package com.saurabh.kotlinbasics

interface Drivable
{
    val maxspeed:Double
    fun drive():String  //returns string
    fun brake()
    {
        println("Brakes are applied.")
    }
}

open class Vehicle(override val maxspeed:Double, var name:String):Drivable
{
    // fun drive():String ="Driving the Car."
    //     it is similar to
    override fun drive(): String {
        return "Driving the Car."
    }

    override fun brake() {
        super.brake()
    }
}

fun main()
{
    var obj: Vehicle = Vehicle(240.0,"Saurabh")

    obj.drive()
    obj.brake()
}