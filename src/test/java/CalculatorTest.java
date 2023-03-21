
import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
public class CalculatorTest {
    private Calculator calc;
    @Before
    public void setUp() {
        calc = new Calculator();
    }
    @Test
    public void test_squareRoot() {
        double val = 64.0;
        double expectedResult = 8.0;
        double result = calc.squareRoot(val);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }

    @Test
    public void test_factorial() {
        int a = 7;
        int expectedResult = 5040;
        int result = calc.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void test_naturalLog() {
        double a = 2.718;
        double expectedResult = 1.0;
        double result = calc.naturalLog(a);
        Assert.assertEquals(expectedResult, result, 0.2f);
    }

    @Test
    public void test_power() {
        double a = 2.0;
        double b = 7.0;
        double expectedResult = 128.0;
        double result = calc.power(a,b);
        Assert.assertEquals(expectedResult, result, 0.0f);
    }
}