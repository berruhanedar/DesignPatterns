package com.berruhanedar.Structural.Adapter;

public class Adapter implements HomeAppliances {

    private Phone phone;

    public Adapter(Phone phone) {
        this.phone = phone;
    }

    @Override
    public int plugAndPlay() {
        return phone.charge();
    }
}
