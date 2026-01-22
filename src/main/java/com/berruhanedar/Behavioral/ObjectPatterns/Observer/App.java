package com.berruhanedar.Behavioral.ObjectPatterns.Observer;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        BigDecimal minTemperature = BigDecimal.valueOf(23);
        BigDecimal maxTemperature = BigDecimal.valueOf(28);

        Thermometer thermometer = new Thermometer(minTemperature, maxTemperature);

        Parents mother = new Parents("Mother");
        Parents father = new Parents("Father");

        thermometer.addObserver(mother);
        thermometer.addObserver(father);

        for(int i = thermometer.getCurrentTemperature().intValue(); i <= 30; i++) {
            thermometer.setCurrentTemperature(BigDecimal.valueOf(i));
        }

        for(int i = thermometer.getCurrentTemperature().intValue(); i >= 22; i--) {
            thermometer.setCurrentTemperature(BigDecimal.valueOf(i));
        }
    }
}
