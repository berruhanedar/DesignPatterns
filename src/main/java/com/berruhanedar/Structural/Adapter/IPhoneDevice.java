package com.berruhanedar.Structural.Adapter;

public class IPhoneDevice implements Phone {

    private int voltage;

    public IPhoneDevice() {
        this.voltage = 5;
    }

    @Override
    public int charge() {
        System.out.println("iPhone is charging");
        return voltage;
    }
}
