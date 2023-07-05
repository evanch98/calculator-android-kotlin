package com.example.assignment_part2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    val calculator: Calculator = Calculator()
    val etNum1: EditText = findViewById(R.id.etNum1)
    val etNum2: EditText = findViewById(R.id.etNum2)
    val radioGroup: RadioGroup = findViewById(R.id.radioGroup)
    val tvResult: TextView = findViewById(R.id.tvResult)
    val btnCalculate: Button = findViewById(R.id.btnCalculate)

    btnCalculate.setOnClickListener {
      val selected = radioGroup.checkedRadioButtonId
      val operator: RadioButton = findViewById(selected)
      val num1 = etNum1.text.toString()
      val num2 = etNum2.text.toString()
      if (num1 == "" || num2 == "") {
        tvResult.text = "Fields cannot be empty"
        return@setOnClickListener
      } else if (operator.text.toString() == "Divide" && num2 == "0") {
        tvResult.text = "Denominator cannot be 0"
        return@setOnClickListener
      } else {
        if (operator.text.toString() == "Add") {
          calculator.add(num1 = num1.toDouble(), num2 = num2.toDouble())
        } else if (operator.text.toString() == "Subtract") {
          calculator.subtract(num1 = num1.toDouble(), num2 = num2.toDouble())
        } else if (operator.text.toString() == "Multiply") {
          calculator.multiply(num1 = num1.toDouble(), num2 = num2.toDouble())
        } else {
          calculator.divide(num1 = num1.toDouble(), num2 = num2.toDouble())
        }
        tvResult.text = calculator.getValue().toString()
      }
    }
  }
}