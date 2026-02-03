package com.berruhanedar.Creational.Factory.example1_goodimplementation;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}