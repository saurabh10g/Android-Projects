package com.saurabh.quiztime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvscore : TextView =findViewById(R.id.tv_score)
        val btnFinish : Button =findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(constants.User_Name)

        val totalQuestions = intent.getIntExtra(constants.Total_questions,0)
        val correctAnswers =intent.getIntExtra(constants.Correct_Answers,0)

        tvscore.text = "You Scored $correctAnswers out of $totalQuestions In This Quiz."

        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}