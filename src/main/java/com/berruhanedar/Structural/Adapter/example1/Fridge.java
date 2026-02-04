package com.berruhanedar.Structural.Adapter.example1;

public class Fridge implements HomeAppliances {

    private int voltage;

    public Fridge() {
        this.voltage = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Fridge is running");
        return voltage;
    }
}