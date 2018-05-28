package michal.ruszkowski89.operation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class SubtractTest {

    @Test
    @Parameters({
        "1, 5, -4",
        "-10, 40, -50",
        "15, -5, 20",
        "-5, -0, -5" })
    public void executeShouldProduceCorrectValue(double a, double b, double correctValue){
        Subtract subtract = new Subtract();

        assertEquals(correctValue, subtract.execute(a, b), 0.0001);
    }
}
