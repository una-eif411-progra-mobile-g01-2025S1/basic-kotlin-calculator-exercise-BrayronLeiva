import org.example.Calculator
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
    //Operations with zero
    //Edge cases (very large numbers, very small numbers)
    //Error conditions (like division by zero)



}