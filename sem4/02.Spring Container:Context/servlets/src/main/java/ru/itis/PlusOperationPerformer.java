package ru.itis;

import org.springframework.stereotype.Component;

@Component
public class PlusOperationPerformer implements OperationPerformer {
    @Override
    public Double performOperation(Double var1, Double var2) {
        return var1 + var2;
    }
}
