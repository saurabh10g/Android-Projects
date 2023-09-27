package com.saurabh.kotlinbasics

abstract class Mammal(val name:String, private val origin:String, private val weight:Double)
{
    abstract var maxSpeed:Double

    abstract fun run()
    abstract fun breath()

    fun display()
    {
        println("Name:$name, Origin:$origin, Weight:$weight "+"Maximum Speed:$maxSpeed")
    }
}

class Human(name:String,origin:String,weight:Double,override var maxSpeed:Double):Mammal(name,origin,weight)
{
    override fun run() {
        println("$name Running on two legs.")
    }

    override fun breath() {
        println("Breath Through Mouth or Nose.")
    }
}

class Elephant(name:String,origin:String,weight:Double,override var maxSpeed:Double):Mammal(name,origin,weight)
{
    override fun run() {
        println("$name Running on four legs.")
    }

    override fun breath() {
        println("Breath Through Trunk.")
    }
}

fun main()
{
    var human = Human("Saurabh","India",54.320,30.00)
    var elephant = Elephant("Jumbo","India",5400.00,40.0)

    human.run()
    elephant.run()
    human.breath()
    elephant.breath()
}