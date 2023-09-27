package com.saurabh.kotlinbasics

fun main() {
    var name: String = "Gadhave"
    //  nullable = null   ====> Compilation error

    var nullableName: String? = "Saurabh"
    nullableName = null

    var len = name.length
    //  var len1 = nullableName.length   ====> Error
    var len1 = nullableName?.length
    // nullableName?.let{println(it.length)}   works if not null

    // ?: elvis operator
    var name2 = nullableName ?: "Apeksha" // if nullableName is null Apeksha gets printed as defualt value else value in nullableName gets printed
    println("Name is $name2")
}