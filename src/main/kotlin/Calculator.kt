package org.example

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class Calculator {
    fun add(a: Double, b: Double): Double = (BigDecimal.valueOf(a) + BigDecimal.valueOf(b)).toDouble()

    fun subtract(a: Double, b: Double) = (BigDecimal.valueOf(a) - BigDecimal.valueOf(b)).toDouble()

    fun multiply(a: Double, b: Double) = (BigDecimal.valueOf(a) * BigDecimal.valueOf(b)).toDouble()

    fun divide(a: Double, b: Double): Double {
        return try {
            val result = BigDecimal(a.toString()).divide(BigDecimal(b.toString()), MathContext.DECIMAL128)
            result.stripTrailingZeros().toDouble()  // <-- Esto ayuda a evitar valores incorrectos
        } catch (e: ArithmeticException) {
            Double.NaN
        }
    }

}