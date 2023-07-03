package com.example.assignment_part2

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

private const val DELTA = 1e-15

class CalculatorTest {

  private lateinit var calculator: Calculator

  @Before
  fun initialize() {
    calculator = Calculator();
  }

  @Test
  fun testInitialCondition() {
    val result = calculator.getValue()
    assertEquals(0.0, result, DELTA)
  }
}