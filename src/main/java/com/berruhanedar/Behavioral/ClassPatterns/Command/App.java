package com.berruhanedar.Behavioral.ClassPatterns.Command;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal number1 = BigDecimal.TEN;
        BigDecimal number2 = BigDecimal.valueOf(2);

        BigDecimal sum = Calculator.calculate(new SumCommand(), number1, number2);
        BigDecimal subtract = Calculator.calculate(new SubtractCommand(), number1, number2);
        BigDecimal multiply = Calculator.calculate(new MultiplyCommand(), number1, number2);
        BigDecimal divide = Calculator.calculate(new DivideCommand(), number1, number2);
        BigDecimal mod = Calculator.calculate(new ModCommand(), number1, number2);

        System.out.println("It sum of number1 and number2 is " + sum +
                "\nIt subtract of number1 and number2 is " + subtract +
                "\nIt multiply of number1 and number2 is " + multiply +
                "\nIt divide of number1 and number2 is " + divide +
                "\nIt mod of number1 and number2 is " + mod);
    }
}
