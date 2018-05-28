package michal.ruszkowski89.operation;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class AddTest {

    @Test
    @Parameters({
        "1, 5, 6",
        "-10, 40, 30",
        "15, -5, 10",
        "-5, -10, -15" })
    public void executeShouldProduceCorrectValue(double a, double b, double correctValue){
        Add add = new Add();

        assertEquals(correctValue, add.execute(a, b), 0.0001);
    }
}
