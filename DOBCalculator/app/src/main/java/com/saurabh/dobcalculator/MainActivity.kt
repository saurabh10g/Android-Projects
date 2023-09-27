package com.saurabh.dobcalculator

import android.app.DatePickerDialog
import android.icu.text.SimpleDateFormat
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import java.util.*


class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? = null
    private var tvAgeInMinutes : TextView? = null

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker : Button = findViewById(R.id.btnDatePicker)
        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMinutes = findViewById(R.id.tvAgeInMinutes)

        btnDatePicker.setOnClickListener {
            clickedDatePicker()
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun clickedDatePicker()
    {
        val obj = Calendar.getInstance()  //Calender is inbuilt class
        val year = obj.get(Calendar.YEAR)
        val month = obj.get(Calendar.MONTH)
        val day = obj.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(this,
                         DatePickerDialog.OnDateSetListener{view,selectedYear,selectedMonth,selectedDayOfMonth ->    // we can also remove DatePickerDialog.OnDateSetListener in this line
                                  Toast.makeText(this,"Done!",Toast.LENGTH_LONG).show()
                             val selectedDate = "$selectedDayOfMonth/${selectedMonth+1}/$selectedYear"
                             tvSelectedDate?.text = selectedDate
                         //similar to =>  tvSelectedDate?.setText(selectedDate)

                             val sdf = SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH)
                             val theDate = sdf.parse(selectedDate)

                             val selectedDateInMinute = theDate.time/60000   // 60000 used to covert milliseconds to minute i.e date/60/1000
                             val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                             val currentTimeInMinutes = currentDate.time/60000

                             val differenceInMinutes = currentTimeInMinutes - selectedDateInMinute

                             tvAgeInMinutes?.text = differenceInMinutes.toString()

                         },
                         year,
                         month,
                         day)   // 5 parameters

        dpd.datePicker.maxDate = System.currentTimeMillis() - 84600000
        dpd.show()
    }
}