package michal.ruszkowski89.operation;

public class Add implements Operation {

    public Add() {
    }

    @Override
    public double execute(double valueBeforeOperation, double operationValue) {
        return valueBeforeOperation + operationValue;
    }
}
