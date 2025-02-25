package org.example

import java.math.BigDecimal
import java.math.MathContext
import java.math.RoundingMode

class Calculator {
    //Se Utiliza BigDecimal para mayor precision matematica
    //Se Usa BigDecimal pero convirtiendo usando valueOf para evitar inprecision
    fun add(a: Double, b: Double): Double = (BigDecimal.valueOf(a) + BigDecimal.valueOf(b)).toDouble()

    fun subtract(a: Double, b: Double) = (BigDecimal.valueOf(a) - BigDecimal.valueOf(b)).toDouble()

    fun multiply(a: Double, b: Double) = (BigDecimal.valueOf(a) * BigDecimal.valueOf(b)).toDouble()

    fun divide(a: Double, b: Double): Double {
        return try {
            //Usa BigDecimal pero convirtiendo el valor a String para evitar inprecision
            val result = BigDecimal(a.toString()).divide(BigDecimal(b.toString()), MathContext.DECIMAL128)
            //Debido a bigdecimal pueden quedar 0 inecesarios por lo que se eliminan antes de pasar a Double
            result.stripTrailingZeros().toDouble()
        } catch (e: ArithmeticException) {
            //Si se lanza un excepcion en la division se retorna Double.NaN que es Not a Number
            Double.NaN
        }
    }

}