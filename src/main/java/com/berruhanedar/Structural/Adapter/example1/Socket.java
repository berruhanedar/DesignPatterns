package com.berruhanedar.Structural.Adapter.example1;

public class Socket {
    public void powerOn(HomeAppliances homeAppliance) {
        int voltage = homeAppliance.plugAndPlay();
        System.out.println("Power on: " + voltage + "V");
    };
}
