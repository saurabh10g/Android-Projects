package com.saurabh.kotlinbasics

 fun main() {
     /*
     //string
     var myName = "Kotlin"
     myName = "Saurabh"    // val does not allow this. As val cannot be overwrite
     println("Hello " + myName)

     var firstchar = myName[0]
     var secchar = myName[1]
     println(firstchar+ "\t" +secchar)

     // string interpolation  or string template
     println("My name is $myName and it contains ${myName.length} letters.")

     //boolean
     var isgood = true   // or var isgood: Boolean =true
     isgood = false

     // character
     var letterchar = 'a'
     var digichar = '1'
     var sychar = '$'        // all are of char data type

     // arithetic operations
     val a =5.0
     val b = 3
     val result: Double
     result = a/b
     println(result)

     //comparision
     val isequal = 5==5
     println("isequal is " + isequal)

     println("is5greaterthan3 ${5>4}")

     //increment or decrement
     var mynum =30
     println("mynum is $mynum")
     println("mynum is ${mynum++}")
     println("mynum is ${++mynum}")
     println("mynum is ${--mynum}")
     println("mynum is ${mynum--}")
     println("mynum is ${mynum}")
*/

     // When expression

//     var month =3
//     when(month){
//         1 -> println("Jan")
//         2 -> println("Feb")
//         3 -> println("March")
//         4 -> {
//             println("theFourthMonth")
//             println("Apr")
//         }
//         else -> println("NOT Present")
     //    }

//     var month = 10
//     when (month){
//       //  !in 0..12 -> println("if Not in 0 to 12")
//         in 2..5 -> println("Summer")
//         in 6..9 -> println("Monsoon")
//         10,11,12,1 -> println("Winter")
//         else -> println("Wrong input for month.")
//     }

//     var x: Any = 13.2324f
//     when(x){
//         is Int -> println("$x is Integer.")
//         is Double -> println("$x is Double.")
//         !is Char -> println("$x is not a Character.")
//         else -> println("None of above.")
//     }

//

//     for(num in 1..10){
//         print("$num ")
//     }
//     println("\n###")
//
//     for(i in 1 until 10){
//         print("$i ")
//     }
//     println("\n###")
//
//     for(i in 10 downTo 1 step 2){   //  for(i in 10.downTo(1).step(2))
//         print("$i ")
//     }

     for(num in 1..10000) {
         if(num == 9001)
             print("IT'S OVER 9000!!!")
     }

 }