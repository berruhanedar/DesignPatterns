package com.berruhanedar.Creational.Factory.example1_badimplementation;

public class VehicleFactory {

    /**
     * Creates a vehicle based on the specified type.
     * @param vehicleType The type of vehicle to create (e.g., "CAR" or "TRUCK")
     * @return An instance of the corresponding vehicle
     * @throws IllegalArgumentException if the vehicle type is invalid
     *
     * Note: This implementation has some design issues:
     * 1. It violates the Open/Closed Principle - each time we add a new vehicle type,
     *    we need to modify this method by adding another else-if block.
     * 2. It violates the Single Responsibility Principle - this method handles both
     *    validation of vehicle types and object creation.
     * 3. It's not scalable - as vehicle types increase, this method becomes complex
     *    and difficult to maintain.
     *
     * A better approach would be to use a registry pattern or reflection
     * to make the factory extensible without modifying existing code.
     */
    public Vehicle createVehicle(String vehicleType) {
        if ("CAR".equals(vehicleType)) {
            return new Car();
        } else if ("TRUCK".equals(vehicleType)) {
            return new Truck();
        } else {
            throw new IllegalArgumentException("Invalid Vehicle Type: " + vehicleType);
        }
    }

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.createVehicle("CAR");
        Vehicle truck = vehicleFactory.createVehicle("TRUCK");
        car.drive();
        truck.drive();
    }
}