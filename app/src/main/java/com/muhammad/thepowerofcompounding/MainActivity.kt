package com.muhammad.thepowerofcompounding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        * capital : 100
        * year roi: 26
        * total years: 10
        * end capital:1000
        * */


        // get reference to button
        val btn_click_me = findViewById(R.id.btnCalculate) as Button
        // set on-click listener
        btn_click_me.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            val editCapital = findViewById<EditText>(R.id.editCapital)
            val editYearRoi = findViewById<EditText>(R.id.editYearRoi)
            val editTotalYears = findViewById<EditText>(R.id.editTotalYears)

            val tvEndCapital = findViewById<TextView>(R.id.tvEndCapital)
            var end_capital = 0

            val capital = editCapital.text.toString().toFloat()
            val yearRoi = editYearRoi.text.toString().toFloat()
            val totalyears = editTotalYears.text.toString().toFloat()
            val base = 1 + yearRoi/100
            end_capital = (capital * Math.pow(base.toDouble(), totalyears.toDouble())).roundToInt()

            val end_capital_str = end_capital.toString()
            tvEndCapital.setText(end_capital_str).toString()
        }



    }
}