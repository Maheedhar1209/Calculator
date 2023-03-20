import org.junit.jupiter.api.Test;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class CalculatorTest {


    @Test
    public void square_root_test() {
        var res = Calculator.square_root(4.0);
        assertEquals(2.0,res);
    }
    @Test
    public void power_test(){

        assertEquals(8.0,Calculator.power(2.0,3.0));
    }
    @Test
    public void factorial(){

        assertEquals(2,Calculator.factorial(2));
    }
    @Test
    public void log(){

        assertEquals(2.30,Calculator.log(10.0),0.02f);

    }
}
