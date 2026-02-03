package com.berruhanedar.Creational.Factory.example2;

public class iPhone17 implements Phone {

    private String model;
    private String battery;
    private int width;
    private int length;

    // For Factory Method
    public iPhone17() {
        this("iPhone 17", "4500 mAh", 75, 155); // Default değerler
    }

    public iPhone17(String model, String battery, int width, int length) {
        this.model = model;
        this.battery = battery;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "iPhone17{" +
                "model='" + model + '\'' +
                ", battery='" + battery + '\'' +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}
