package michal.ruszkowski89;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;


@RunWith(JUnit4.class)
public class CalculatorServiceTest {
    private ArrayList<String[]> operationList;
    CalculatorService service = new CalculatorService();

    @Before
    public void setUp(){
        operationList = new ArrayList<>();
        operationList.add(new String[]{"multiply", "5"});
        operationList.add(new String[]{"add", "10"});
        operationList.add(new String[]{"subtract", "7"});
        operationList.add(new String[]{"apply", "20"});
    }


    @Test
    public void findStartingValueShouldReturn20(){
        assertEquals(20, service.findStartingValue(operationList), 0.00001);
    }

    @Test
    public void calculateFunctionShouldReturn108(){
        assertEquals(103, service.calculate(operationList), 0.00001);
    }
}