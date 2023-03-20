import org.junit.jupiter.api.Test;
import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
class CalculatorTest {

    private final Calculator mycalc = new Calculator();
    @Test
    public void square_root_test() {
        var res = mycalc.square_root(4.0);
        assertEquals(2.0,res);
    }
    @Test
    public void power_test(){

        assertEquals(8.0,mycalc.power(2.0,3.0));
    }
    @Test
    public void factorial(){

        assertEquals(2.0,mycalc.factorial(2.0));
    }
    @Test
    public void log(){

        assertEquals(2.30,mycalc.log(10.0),0.02f);

    }
}
