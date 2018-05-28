package michal.ruszkowski89;

import michal.ruszkowski89.operation.Add;
import michal.ruszkowski89.operation.Divide;
import michal.ruszkowski89.operation.Multiply;
import michal.ruszkowski89.operation.Subtract;

import java.util.ArrayList;

public class CalculatorService {

    CalculatorService() {
    }

    public double findStartingValue(ArrayList<String[]> operationList){
        double startingValue = 0;

        for (String[] line : operationList){
            if (line[0].equalsIgnoreCase("apply")){
                startingValue = Double.parseDouble(line[1]);
            }
        }

        return startingValue;
    }

    public double executeOperation(double result, String[] operation){
        switch (operation[0]){
            case "add":
                Add add = new Add();
                result = add.execute(result, Double.parseDouble(operation[1]));
                break;
            case "subtract":
                Subtract subtract = new Subtract();
                result = subtract.execute(result, Double.parseDouble(operation[1]));
                break;
            case "divide":
                Divide divide = new Divide();
                result = divide.execute(result, Double.parseDouble(operation[1]));
                break;
            case "multiply":
                Multiply multiply = new Multiply();
                result = multiply.execute(result, Double.parseDouble(operation[1]));
                break;
            case "apply":
                break;
        }
        return result;
    }

    public double calculate(ArrayList<String[]> operationList){
        double result = findStartingValue(operationList);

        for (int i = 0; i< operationList.size(); i++){
            result = executeOperation(result, operationList.get(i));
        }
        return result;
    }

}
