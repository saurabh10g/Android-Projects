package com.saurabh.quiztime

data class Question(
    val id : Int,
    val Country : String,
    val option1 : String,
    val option2 : String,
    val option3 : String,
    val option4 : String,
    val coerrectAnswer : Int
)
