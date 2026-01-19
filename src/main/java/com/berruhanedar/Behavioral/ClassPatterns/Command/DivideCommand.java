package com.berruhanedar.Behavioral.ClassPatterns.Command;

import java.math.BigDecimal;

public class DivideCommand implements Calculate{
    @Override
    public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
        return number1.divide(number2);
    }
}
