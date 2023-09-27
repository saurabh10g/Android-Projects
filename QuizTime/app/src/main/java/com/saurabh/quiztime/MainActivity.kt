package com.saurabh.quiztime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_start :Button = findViewById(R.id.btn_start)
        val et_name : EditText = findViewById(R.id.et_name)

        btn_start.setOnClickListener{
            if(et_name.text.isEmpty())
            {
                Toast.makeText(this,"Name is not entered !", Toast.LENGTH_LONG).show()
            }
            else
            {
                val intent = Intent(this,SecondScreen::class.java)   // This allows us to move from this activity to SecondScreen activity
                intent.putExtra(constants.User_Name,et_name.text.toString())
                startActivity(intent)
                //finish()   By using this method we can stop the first activity , and if we press previous /back btn of mobile app will be closed
            }
        }
    }
}