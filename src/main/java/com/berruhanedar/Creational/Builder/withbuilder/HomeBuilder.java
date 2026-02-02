package com.berruhanedar.Creational.Builder.withbuilder;

public class HomeBuilder {
    private String city;
    private String state;
    private String country;

    private int yearsBuilt;
    private int balconyNumbers;
    private int numberOfRooms;
    private int numberOfBathrooms;
    private int numberOfToilets;

    private boolean isDuplex;
    private boolean isFurnished;
    private boolean hasGarage;
    private boolean hasPlayground;
    private boolean hasAirConditioning;
    private boolean hasSwimmingPool;

    public static HomeBuilder startBuild(){
        return new HomeBuilder();
    }

    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public HomeBuilder setCountry(String country) {
        this.country = country;
        return this;
    }

    public HomeBuilder setYearsBuilt(int yearsBuilt) {
        this.yearsBuilt = yearsBuilt;
        return this;
    }

    public HomeBuilder setBalconyNumbers(int balconyNumbers) {
        this.balconyNumbers = balconyNumbers;
        return this;
    }

    public HomeBuilder setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        return this;
    }

    public HomeBuilder setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
        return this;
    }

    public HomeBuilder setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
        return this;
    }

    public HomeBuilder setDuplex(boolean duplex) {
        isDuplex = duplex;
        return this;
    }

    public HomeBuilder setFurnished(boolean furnished) {
        isFurnished = furnished;
        return this;
    }

    public HomeBuilder setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    public HomeBuilder setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
        return this;
    }

    public HomeBuilder setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
        return this;
    }

    public HomeBuilder setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
        return this;
    }

    public Home build() {
        return new Home(
                city,
                state,
                country,
                yearsBuilt,
                balconyNumbers,
                numberOfRooms,
                numberOfBathrooms,
                numberOfToilets,
                isDuplex,
                isFurnished,
                hasGarage,
                hasPlayground,
                hasAirConditioning,
                hasSwimmingPool
        );
    }
}
