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

  @Test
  fun testAddFunction1() {
    calculator.add(1.0, 1.0)
    val result = calculator.getValue()
    assertEquals(2.0, result, DELTA)
  }

  @Test
  fun testAddFunction2() {
    calculator.add(100.5, 200.0)
    val result = calculator.getValue()
    assertEquals(300.5, result, DELTA)
  }

  @Test
  fun testSubtractFunction1() {
    calculator.subtract(50.0, 30.0)
    val result = calculator.getValue()
    assertEquals(20.0, result, DELTA)
  }

  @Test
  fun testSubtractFunction2() {
    calculator.subtract(10.0, 20.0)
    val result = calculator.getValue()
    assertEquals(-10.0, result, DELTA)
  }

  @Test
  fun testMultiplyFunction1() {
    calculator.multiply(20.0, 20.0)
    val result = calculator.getValue()
    assertEquals(400.0, result, DELTA)
  }

  @Test
  fun testMultiplyFunction2() {
    calculator.multiply(12.5, 30.0)
    val result = calculator.getValue()
    assertEquals(375.0, result, DELTA)
  }

  @Test
  fun testDivideFunction1() {
    calculator.divide(100.0, 2.0)
    val result = calculator.getValue()
    assertEquals(50.0, result, DELTA)
  }

  @Test(expected = NumberFormatException::class)
  fun testDivideFunction2() {
    calculator.divide(100.0, 0.0)
  }
}