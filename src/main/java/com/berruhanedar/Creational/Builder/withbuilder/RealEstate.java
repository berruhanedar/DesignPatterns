package com.berruhanedar.Creational.Builder.withbuilder;

public class RealEstate {
    public static void main(String[] args) {
        Home home = HomeBuilder.startBuild()
                .setCity("Istanbul")
                .setCountry("Turkey")
                .setNumberOfRooms(3)
                .setYearsBuilt(10)
                .setHasAirConditioning(true)
                .setHasGarage(true)
                .setHasSwimmingPool(true)
                .build();

        printHome(home);
    }

    // If you don't set anything, it will be null.
    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Home added : " + home);
    }

}
