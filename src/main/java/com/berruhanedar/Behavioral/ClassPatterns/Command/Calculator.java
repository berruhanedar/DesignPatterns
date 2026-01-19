package com.berruhanedar.Behavioral.ClassPatterns.Command;

import java.math.BigDecimal;

public class Calculator {
    public static BigDecimal calculate(Calculate calculate, BigDecimal number1, BigDecimal number2) {
        return calculate.calculate(number1, number2);
    }
}
