package michal.ruszkowski89.operation;

public class Divide implements Operation {


    public Divide() {}

    @Override
    public double execute(double valueBeforeOperation, double operationValue) {
        if (operationValue == 0){
            System.out.println("Division by 0 is not allowed, please provide correct set of instructions next time.");
            return valueBeforeOperation;
        } else {
            return valueBeforeOperation / operationValue;
        }
    }
}
