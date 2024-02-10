package ru.itis;

public class SingleOperationCalculator {

    private OperationPerformer operationPerformer;

    public Double calculate(Double var1, Double var2){
        return operationPerformer.performOperation(var1,var2);
    }
}
