package com.saurabh.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.Mybutton)
        val tvMytextview = findViewById<TextView>(R.id.textView2)
        var timesClicked =0

        btnClickMe.setOnClickListener {
            timesClicked += 1
            tvMytextview.text = timesClicked.toString()
            Toast.makeText(this, "Clicked !!!", Toast.LENGTH_LONG).show()
        }
    }
}