package michal.ruszkowski89.operation;

public class Subtract implements Operation {

    public Subtract() {}

    @Override
    public double execute(double valueBeforeOperation, double operationValue) {
        return valueBeforeOperation - operationValue;
    }
}
