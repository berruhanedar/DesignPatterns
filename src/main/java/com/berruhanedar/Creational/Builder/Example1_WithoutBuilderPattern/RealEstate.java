package com.berruhanedar.Creational.Builder.Example1_WithoutBuilderPattern;

public class RealEstate {
    public static void main(String[] args) {
        // First Way
        Home home = new Home();
        home.setCity("Istanbul");
        home.setState("Atasehir");
        home.setCountry("Turkey");
        home.setNumberOfRooms(3);
        home.setYearsBuilt(10);
        home.setHasAirConditioning(true);

        printHome(home);

        // Second Way
        Home home2 = new Home("Istanbul", "Atasehir", "Turkey", 5, 3, 3, 2, 2, true, false, true, true, true, true);

        printHome(home2);
    }

    // Even if you don't set anything, default values will be used.
    private static void printHome(Home home) {
        System.out.println();
        System.out.println("Home added : " + home);
    }

}
