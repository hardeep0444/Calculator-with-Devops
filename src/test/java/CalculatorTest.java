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


}
