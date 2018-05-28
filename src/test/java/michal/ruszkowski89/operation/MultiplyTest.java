package michal.ruszkowski89.operation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MultiplyTest {

    @Test
    @Parameters({
        "1, 5, 5",
        "0, 40, 0",
        "15, -5, -75",
        "-0, 3, 0" })
    public void executeShouldProduceCorrectValue(double a, double b, double correctValue){
        Multiply multiply = new Multiply();

        assertEquals(correctValue, multiply.execute(a, b), 0.0001);
    }
}
