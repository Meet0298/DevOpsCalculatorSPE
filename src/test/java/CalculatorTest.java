import calculator.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void square_rootTruePositive() {
        assertEquals("Finding the square root for True Positive", 3.0, calculator.square_root(9), DELTA);
        assertEquals("Finding the square root for True Positive", 2.0, calculator.square_root(4), DELTA);
    }

    @Test
    public void square_rootFalsePositive() {
        assertNotEquals("Finding square root for False Positive", 1.0, calculator.square_root(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.square_root(4), DELTA);

    }

    @Test
    public void factTruePositive() {
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factorial(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factFalsePositive() {
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.factorial(3), DELTA);
    }

    @Test
    public void powerTruePositive() {
        assertEquals("Finding power for True Positive", 16.0, calculator.power(2, 4), DELTA);
        assertEquals("Finding power for True Positive", 64.0, calculator.power(4, 3), DELTA);
    }

    @Test
    public void powerFalsePositive() {
        assertNotEquals("Finding power for False Positive", 6.0, calculator.power(2, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -7.3, calculator.power(2, 3), DELTA);
    }

    @Test
    public void logarithmTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logarithmFalsePositive() {
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog(2.1), DELTA);
    }

}
