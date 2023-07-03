package com.example.assignment_part2

import java.lang.NumberFormatException

class Calculator: Operator {
  private var value: Double = 0.0

  private fun setValue(value: Double) {
    this.value = value
  }

  fun getValue(): Double {
    return this.value
  }

  override fun add(num1: Double, num2: Double) {
    this.setValue(num1 + num2)
  }

  override fun subtract(num1: Double, num2: Double) {
    this.setValue(num1 - num2)
  }

  override fun multiply(num1: Double, num2: Double) {
    this.setValue(num1 * num2)
  }

  override fun divide(num1: Double, num2: Double) {
    if (num2 == 0.0) {
      throw NumberFormatException("The denominator cannot be zero.")
    }
    this.setValue(num1 / num2)
  }
}