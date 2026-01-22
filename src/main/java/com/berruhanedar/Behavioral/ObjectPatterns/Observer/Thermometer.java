package com.berruhanedar.Behavioral.ObjectPatterns.Observer;

import java.math.BigDecimal;

public class Thermometer extends Observable{

    private BigDecimal currentTemperature;
    private BigDecimal minTemperature;
    private BigDecimal maxTemperature;

    public Thermometer(BigDecimal minTemperature, BigDecimal maxTemperature) {
        this.currentTemperature = BigDecimal.valueOf(24);
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public BigDecimal getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(BigDecimal currentTemperature) {
        this.currentTemperature = currentTemperature;
        System.out.println("Current temperature is " + currentTemperature);
        checkTemperature();
    }

    private void checkTemperature() {
        boolean isTooHot = currentTemperature.compareTo(maxTemperature) >= 0;
        boolean isTooLow = currentTemperature.compareTo(minTemperature) <= 0;
        if(isTooHot || isTooLow) {
            notifyObservers();
        }
    }


}
