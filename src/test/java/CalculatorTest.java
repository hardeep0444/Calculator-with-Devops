import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    public static final double DELTA = 1e-15;

    @Test
    public void addTruePositive()
    {
        assertEquals("Finding sum of True Positive", 10, calculator.add(5,5), DELTA);
        assertEquals("Finding sum of True Positive", 25, calculator.add(13,12), DELTA);
    }
    @Test
    public void addFalsePositive()
    {
        assertNotEquals("Finding sum of False Positive", 10, calculator.add(5,2), DELTA);
        assertNotEquals("Finding sum of False Positive", 25, calculator.add(10,12), DELTA);
    }
    @Test
    public void subtractTruePositive()
    {
        assertEquals("Finding difference of True Positive", 0, calculator.subtract(5,5), DELTA);
        assertEquals("Finding difference of True Positive", 1, calculator.subtract(13,12), DELTA);
    }
    @Test
    public void subtractFalsePositive()
    {
        assertNotEquals("Finding difference of False Positive", 10, calculator.subtract(5,2), DELTA);
        assertNotEquals("Finding difference of False Positive", 25, calculator.subtract(12,10), DELTA);
    }
    @Test
    public void multiplyTruePositive()
    {
        assertEquals("Finding product of True Positive", 25, calculator.multiply(5,5), DELTA);
        assertEquals("Finding product of True Positive", 36, calculator.multiply(3,12), DELTA);
    }
    @Test
    public void multiplyFalsePositive()
    {
        assertNotEquals("Finding product of False Positive", 1, calculator.multiply(5,2), DELTA);
        assertNotEquals("Finding product of False Positive", 25, calculator.multiply(10,12), DELTA);
    }
    @Test
    public void divideTruePositive()
    {
        assertEquals("Finding division of True Positive", 1, calculator.divide(5,5), DELTA);
        assertEquals("Finding division of True Positive", 4, calculator.divide(12,3), DELTA);
    }
    @Test
    public void divideFalsePositive()
    {
        assertNotEquals("Finding division of False Positive", 1, calculator.divide(5,1), DELTA);
        assertNotEquals("Finding division of False Positive", 25, calculator.divide(120,12), DELTA);
    }
    @Test(expected = ArithmeticException.class)
    public void divideByZero()
    {
        calculator.divide(4,0);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 113, calculator.fact(5), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 10, calculator.fact(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 42, calculator.fact(4), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 9, calculator.fact(2), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 0, calculator.fact(0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("Finding power for True Positive", 1, calculator.power(1, 3), DELTA);
        assertEquals("Finding power for True Positive", 81, calculator.power(3, 4), DELTA);
        assertEquals("Finding power for True Positive", 64, calculator.power(4, 3), DELTA);
        assertEquals("Finding power for True Positive", 25, calculator.power(5, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 6, calculator.power(2, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -7, calculator.power(3, 3), DELTA);
        assertNotEquals("Finding power for False Positive", 99, calculator.power(4, 3), DELTA);
        assertNotEquals("Finding power for False Positive", -12, calculator.power(5, 3), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);

    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 60, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 4.7, calculator.naturalLog(2.1), DELTA);
    }

    @Test
    public void squareRootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.squareRoot(16), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.squareRoot(1), DELTA);
        assertEquals("Finding square root for True Positive", 9, calculator.squareRoot(81), DELTA);
        assertEquals("Finding square root for True Positive", 6, calculator.squareRoot(36), DELTA);
    }

    @Test
    public void squareRootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.squareRoot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 3, calculator.squareRoot(4), DELTA);
        assertNotEquals("Finding square root for False Positive", 4, calculator.squareRoot(81), DELTA);
        assertNotEquals("Finding square root for False Positive", 2, calculator.squareRoot(36), DELTA);

    }


}
