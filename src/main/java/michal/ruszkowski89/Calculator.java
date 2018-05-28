package michal.ruszkowski89;

import java.util.ArrayList;

public class Calculator{

    public static void main(String[] args){
        CalculatorService service = new CalculatorService();
        FileParser parser = new FileParser();
        ArrayList<String[]> operationList = parser.parseFile("instructions.txt");

        System.out.println(service.calculate(operationList));
    }

}
