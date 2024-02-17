package ru.itis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SingleOperationCalculator {

    @Autowired
    private OperationPerformer operationPerformer;

    public Double performOperation(Double var1, Double var2){
        return operationPerformer.performOperation(var1,var2);
    }
}
