package com.berruhanedar.Creational.Factory.example1_badimplementation;

public class Truck implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Truck is Driving");
    }
}