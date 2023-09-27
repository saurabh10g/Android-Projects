package com.saurabh.kotlinbasics

import android.app.ApplicationErrorReport

open class Car (var name:String,var brand:String)   // To make class non-inheritable we have to use sealed word
{
    var range:Double = 40.38

    open fun drive(speed:Double)
    {
        println("You can drive $brand $name with $speed Km/hr")
    }

    fun paint()
    {
        println("Painting of $brand $name is to be done.")
    }
}

class Electric(name:String,brand: String,Battery:Double) : Car (name,brand)
{
    //  override var range = Battery*5         NOT POSSIBLE AS PROPEERTY IS NOT MADE OPEN

    override fun drive(speed: Double) {
        super.drive(speed)
        println("Drive Method is overrided")
    }
}

fun main()
{
    var AudiQ3 = Car("Q3","Audi")
    var TeslaS = Electric("Model-S","Tesla",80.00)

    AudiQ3.drive(280.00)
    AudiQ3.paint()

    TeslaS.drive(240.00)
    TeslaS.paint()
}