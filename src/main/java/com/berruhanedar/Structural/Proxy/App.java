package com.berruhanedar.Structural.Proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        DirectorProxy proxy = new DirectorProxy("Berru", "Berru123");
        try {
            BigDecimal turnover = proxy.getTurnover();
            System.out.println("Company's Turnover: " + turnover);
        } catch (IllegalAccessException e) {
            System.out.println("You can't access the company's Turnover");
        }

    }
}
