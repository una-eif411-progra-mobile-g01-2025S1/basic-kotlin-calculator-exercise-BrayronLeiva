import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    private lateinit var calculator: Calculator

    @BeforeEach
    fun setUp() {
        calculator = Calculator()
    }

    //Basic operations with positive numbers
    @Test
    fun `test addition of two numbers`() {
        val result = calculator.add(2.0,2.0);
        assertEquals(4.0,result,"El resultado de `add` es distinto a 4.0")
    }

    @Test
    fun `test subtraction of two numbers`() {
        val result = calculator.subtract(2.0,2.0);
        assertEquals(0.0,result,"El resultado de `subtract` es distinto a 0.0")
    }

    @Test
    fun `test multiplication of two numbers`() {
        val result = calculator.multiply(2.0,3.0);
        assertEquals(6.0,result,"El resultado de `multiplication` es distinto a 6.0")
    }

    @Test
    fun `test division of two numbers`() {
        val result = calculator.divide(4.0,4.0);
        assertEquals(1.0,result,"El resultado de `division` es distinto a 0.0")
    }

    //With Decimals

    @Test
    fun `test addition of two numbers with decimals`() {
        val result = calculator.add(2.5,1.6);
        assertEquals(4.1,result,"El resultado de `add` es distinto a 4.1")
    }

    @Test
    fun `test subtraction of two numbers  with decimals`() {
        val result = calculator.subtract(2.0,1.3);
        assertEquals(0.7,result,"El resultado de `subtract` es distinto a 0.7")
    }

    @Test
    fun `test multiplication of two numbers  with decimals`() {
        val result = calculator.multiply(2.0,0.5);
        assertEquals(1.0,result,"El resultado de `multiplication` es distinto a 1.0")
    }

    @Test
    fun `test division of two numbers  with decimals`() {
        val result = calculator.divide(5.0,2.0);
        assertEquals(2.5,result,"El resultado de `division` es distinto a 2.5")
    }

    //Operations with negative numbers

    @Test
    fun `test addition of two negative numbers`() {
        val result = calculator.add(-2.0,2.0);
        assertEquals(0.0,result,"El resultado de `add` es distinto a 0.0")
    }

    @Test
    fun `test subtraction of two negative numbers`() {
        val result = calculator.subtract(-2.0,2.0);
        assertEquals(-4.0,result,"El resultado de `subtract` es distinto a -4.0")
    }

    @Test
    fun `test multiplication of two negative numbers`() {
        val result = calculator.multiply(-2.0,3.0);
        assertEquals(-6.0,result,"El resultado de `multiplication` es distinto a -6.0")
    }

    @Test
    fun `test division of two negative numbers`() {
        val result = calculator.divide(-4.0,2.0);
        assertEquals(-2.0,result,"El resultado de `division` es distinto a -2.0")
    }

    //With Decimals

    @Test
    fun `test addition of two negative numbers with decimals`() {
        val result = calculator.add(-2.5,1.5);
        assertEquals(-1.0,result,"El resultado de `add` es distinto a -1.0")
    }

    @Test
    fun `test subtraction of two negative numbers  with decimals`() {
        val result = calculator.subtract(2.0,-1.3);
        assertEquals(3.3,result,"El resultado de `subtract` es distinto a 3.3")
    }

    @Test
    fun `test multiplication of two negative numbers with decimals`() {
        val result = calculator.multiply(-2.0,0.5);
        assertEquals(-1.0,result,"El resultado de `multiplication` es distinto a -1.0")
    }

    @Test
    fun `test division of two negative numbers with decimals`() {
        val result = calculator.divide(-5.0,2.0);
        assertEquals(-2.5,result,"El resultado de `division` es distinto a -2.5")
    }

    //Operations with zero

    @Test
    fun `test addition between 0 and -0`() {
        val result = calculator.add(0.0,-0.0);
        assertEquals(0.0,result,"El resultado de `add` es distinto a 0.0")
    }

    @Test
    fun `test addition between 0 and other number don't change the number`() {
        val result = calculator.add(0.0,5.0);
        assertEquals(5.0,result,"El resultado de `add` es distinto a 5.0")
    }

    @Test
    fun `test subtraction between 0 and -0`() {
        val result = calculator.subtract(0.0,-0.0);
        assertEquals(0.0,result,"El resultado de `subtract` es distinto a 0.0")
    }

    @Test
    fun `test subtraction between a number - 0 don't change the number`() {
        val result = calculator.subtract(5.0,0.0);
        assertEquals(5.0,result,"El resultado de `subtract` es distinto a 5.0")
    }

    @Test
    fun `test subtraction between 0 and other number turn the number negative`() {
        val result = calculator.subtract(0.0,5.0);
        assertEquals(-5.0,result,"El resultado de `subtract` es distinto a -5.0")
    }

    @Test
    fun `test multiplication between 0 and -0`() {
        val result = calculator.multiply(0.0,-0.0);
        assertEquals(0.0,result,"El resultado de `multiplication` es distinto a -0.0")
    }

    @Test
    fun `test multiplication between 0 and any number is 0`() {
        val result = calculator.multiply(55.0,0.0);
        assertEquals(0.0,result,"El resultado de `multiplication` es distinto a 0.0")
    }

    @Test
    fun `test division of any number by 0`() {
        val result = calculator.divide(0.0,5.0);
        assertEquals(0.0,result,"El resultado de `division` es distinto a 0")
    }


    //Edge cases (very large numbers, very small numbers)

    @Test
    fun `test sum of max value with itself`() {
        val result = calculator.add(Double.MAX_VALUE, Double.MAX_VALUE)
        assertEquals(Double.POSITIVE_INFINITY, result, "La suma de MAX_VALUE + MAX_VALUE debe ser Infinity")
    }

    @Test
    fun `test sum of min value with itself`() {
        val result = calculator.add(Double.MIN_VALUE, Double.MIN_VALUE)
        assertEquals(Double.MIN_VALUE * 2, result, "La suma de MIN_VALUE + MIN_VALUE debe ser MIN_VALUE * 2")
    }

    @Test
    fun `test sum of max value and min value`() {
        val result = calculator.add(Double.MAX_VALUE, Double.MIN_VALUE)
        assertEquals(Double.MAX_VALUE, result, "MAX_VALUE + MIN_VALUE sigue siendo MAX_VALUE")
    }

    // 🟢 RESTA

    @Test
    fun `test subtraction of max value from itself`() {
        val result = calculator.subtract(Double.MAX_VALUE, Double.MAX_VALUE)
        assertEquals(0.0, result, "MAX_VALUE - MAX_VALUE debe ser 0")
    }

    @Test
    fun `test subtraction of min value from itself`() {
        val result = calculator.subtract(Double.MIN_VALUE, Double.MIN_VALUE)
        assertEquals(0.0, result, "MIN_VALUE - MIN_VALUE debe ser 0")
    }

    @Test
    fun `test subtraction of min value from max value`() {
        val result = calculator.subtract(Double.MAX_VALUE, Double.MIN_VALUE)
        assertEquals(Double.MAX_VALUE, result, "MAX_VALUE - MIN_VALUE sigue siendo MAX_VALUE")
    }

    // 🟢 MULTIPLICACIÓN

    @Test
    fun `test multiplication of the max value by 2`() {
        val result = calculator.multiply(Double.MAX_VALUE, 2.0)
        assertEquals(Double.POSITIVE_INFINITY, result, "MAX_VALUE * 2 no es Infinity")
    }

    @Test
    fun `test multiplication of the min value by 2`() {
        val result = calculator.multiply(Double.MIN_VALUE, 2.0)
        assertEquals(Double.MIN_VALUE * 2, result, "MIN_VALUE * 2 no es MIN_VALUE * 2")
    }

    @Test
    fun `test multiplication of the max value by 0`() {
        val result = calculator.multiply(Double.MAX_VALUE, 0.0)
        assertEquals(0.0, result, "MAX_VALUE * 0 no es 0")
    }

    @Test
    fun `test multiplication of the min value by 0`() {
        val result = calculator.multiply(Double.MIN_VALUE, 0.0)
        assertEquals(0.0, result, "MIN_VALUE * 0 no es 0")
    }

    @Test
    fun `test division of large number by itself`() {
        val result = calculator.divide(Double.MAX_VALUE, Double.MAX_VALUE)
        assertEquals(1.0, result, "El resultado de `division` es distinto a 1")
    }

    //3
    @Test
    fun `test 0 divided by large number`() {
        val result = calculator.divide(0.0, Double.MAX_VALUE)
        assertEquals(0.0, result, "El resultado de `division` es distinto a 0")
    }

    @Test
    fun `test zero divided by small number`() {
        val result = calculator.divide(0.0, Double.MIN_VALUE)
        assertEquals(0.0, result, "El resultado de `division` es distinto a 0")
    }

    //Weird Cases
    @Test
    fun `test division of large numbers`() {
        val result = calculator.divide(Double.MAX_VALUE, 0.0000001)
        assertTrue(result.isInfinite(), "El resultado no es Infinity al dividir un nnmero demasiado grande por uno pequeño")
    }

    @Test
    fun `test division of the smallest number by the largest number`() {
        val result = calculator.divide(Double.MIN_VALUE, Double.MAX_VALUE)
        assertEquals(0.0, result, "El resultado de `division` es distinto a 0")
    }

    //Error conditions (like division by zero)

    @Test
    fun `test addition of numbers with precision errors`() {
        val result = calculator.add(-2.5,1.6);
        assertEquals(-0.9,result,"El resultado de `add` es distinto a -0.9")
    }

    @Test
    fun `test substract of numbers with precision errors`() {
        val result = calculator.subtract(0.3,0.2);
        assertEquals(0.1,result,"El resultado de `substract` es distinto a -0.9")
    }

    @Test
    fun `test multiply of numbers with precision errors`() {
        val result = calculator.multiply(0.1,0.2);
        assertEquals(0.02,result,"El resultado de `multiply` es distinto a -0.9")
    }

    @Test
    fun `test division of numbers with precision errors`() {
        val result = calculator.divide(1.0,3.0);
        assertEquals(0.3333333333333333,result,"El resultado de `division` es distinto a -0.9")
    }

    @Test
    fun `test division of numbers throwing an exception `() {
        val result = calculator.divide(5.0,0.0);
        assertTrue(result.isNaN(),"El resultado de `division` no retorno NaN")
    }

}