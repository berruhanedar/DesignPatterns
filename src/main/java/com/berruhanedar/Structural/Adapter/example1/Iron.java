package com.berruhanedar.Structural.Adapter.example1;

public class Iron implements HomeAppliances {

    private int voltage;

    public Iron() {
        this.voltage = 220;
    }

    @Override
    public int plugAndPlay() {
        System.out.println("Iron is working");
        return voltage;
    }
}
