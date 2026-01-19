package com.berruhanedar.Behavioral.ClassPatterns.Command;

import java.math.BigDecimal;

public class ModCommand implements Calculate{
    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        return number1.remainder(number2);
    }
}
