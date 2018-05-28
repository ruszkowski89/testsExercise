package michal.ruszkowski89.operation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class DivideTest {

    @Test
    @Parameters({
        "5, 1, 5",
        "44, 6, 7.333333",
        "-6, 9, -0.666666",
        "9, 0, 9"
    })
    public void executeShouldProduceCorrectValue(double a, double b, double correctValue){
        Divide divide = new Divide();

        assertEquals(correctValue, divide.execute(a, b), 0.0001);
    }
}
