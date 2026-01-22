package com.berruhanedar.Behavioral.ObjectPatterns.Observer;

public class Parents implements Observer {

    private String name;

    public Parents(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        Thermometer thermometer = (Thermometer) observable;
        System.out.println(name + "said that it's okay: " + thermometer.getCurrentTemperature() + " .");

    }
}
