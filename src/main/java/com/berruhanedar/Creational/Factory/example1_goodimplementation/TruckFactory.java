package com.berruhanedar.Creational.Factory.example1_goodimplementation;

public class TruckFactory extends VehicleFactory {
    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}