package com.berruhanedar.Creational.Factory.example1_goodimplementation;

public class CarFactory extends VehicleFactory{
    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}