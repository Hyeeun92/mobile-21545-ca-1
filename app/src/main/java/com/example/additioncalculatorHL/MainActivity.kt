package com.example.additioncalculatorHL

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("Calculator","this is addition calculator ")

        val calculateButton: Button = findViewById(R.id.button)
        calculateButton.setOnClickListener{calculateNumbers()}

    }

    private fun calculateNumbers(){

        val resultNumber: TextView = findViewById(R.id.result)

        val firstNumber: TextView = findViewById(R.id.first_number)
        val secondNumber: TextView = findViewById(R.id.second__number)
        val number1 = Integer.parseInt(firstNumber.text.toString())
        val number2 = Integer.parseInt(secondNumber.text.toString())
        val result = number1 + number2

        resultNumber.text = result.toString()



    }






}