package com.berruhanedar.Creational.Factory.example1_goodimplementation;

public class App {
    public static void main(String[] args) {
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        VehicleFactory truckFactory = new TruckFactory();
        Vehicle truck = truckFactory.createVehicle();

        car.drive();
        truck.drive();

    }
}