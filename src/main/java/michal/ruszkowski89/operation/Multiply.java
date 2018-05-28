package michal.ruszkowski89.operation;

public class Multiply implements Operation {

    public Multiply() {}

    @Override
    public double execute(double valueBeforeOperation, double operationValue) {
        return valueBeforeOperation * operationValue;
    }
}
