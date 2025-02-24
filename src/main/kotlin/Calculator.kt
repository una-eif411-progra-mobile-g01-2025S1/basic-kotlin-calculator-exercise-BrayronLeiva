package org.example

import java.math.BigDecimal
import java.math.RoundingMode

class Calculator {
    fun add(a: Double, b: Double): Double = (BigDecimal.valueOf(a) + BigDecimal.valueOf(b)).toDouble()

    fun subtract(a: Double, b: Double) = (BigDecimal.valueOf(a) - BigDecimal.valueOf(b)).toDouble()

    fun multiply(a: Double, b: Double) = (BigDecimal.valueOf(a) * BigDecimal.valueOf(b)).toDouble()

    fun divide(a: Double, b: Double): Double {
        return try {
            ((BigDecimal.valueOf(a) / BigDecimal.valueOf(b)).toDouble())
        } catch (e: ArithmeticException) {
            Double.NaN
        }
    }
}