package com.berruhanedar.Creational.Builder.Example1;

public class Home {
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

    public Home() {
    }

    // A constructor that includes all parameters is called a telescoping constructor.
    public Home(String city, String state, String country, int yearsBuilt, int balconyNumbers, int numberOfRooms, int numberOfBathrooms, int numberOfToilets, boolean isDuplex, boolean isFurnished, boolean hasGarage, boolean hasPlayground, boolean hasAirConditioning, boolean hasSwimmingPool) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.yearsBuilt = yearsBuilt;
        this.balconyNumbers = balconyNumbers;
        this.numberOfRooms = numberOfRooms;
        this.numberOfBathrooms = numberOfBathrooms;
        this.numberOfToilets = numberOfToilets;
        this.isDuplex = isDuplex;
        this.isFurnished = isFurnished;
        this.hasGarage = hasGarage;
        this.hasPlayground = hasPlayground;
        this.hasAirConditioning = hasAirConditioning;
        this.hasSwimmingPool = hasSwimmingPool;
    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", yearsBuilt=" + yearsBuilt +
                ", balconyNumbers=" + balconyNumbers +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", numberOfToilets=" + numberOfToilets +
                ", isDuplex=" + isDuplex +
                ", isFurnished=" + isFurnished +
                ", hasGarage=" + hasGarage +
                ", hasPlayground=" + hasPlayground +
                ", hasAirConditioning=" + hasAirConditioning +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearsBuilt() {
        return yearsBuilt;
    }

    public void setYearsBuilt(int yearsBuilt) {
        this.yearsBuilt = yearsBuilt;
    }

    public int getBalconyNumbers() {
        return balconyNumbers;
    }

    public void setBalconyNumbers(int balconyNumbers) {
        this.balconyNumbers = balconyNumbers;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public void setNumberOfBathrooms(int numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(int numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    public boolean isHasPlayground() {
        return hasPlayground;
    }

    public void setHasPlayground(boolean hasPlayground) {
        this.hasPlayground = hasPlayground;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public void setHasAirConditioning(boolean hasAirConditioning) {
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }

    public void setHasSwimmingPool(boolean hasSwimmingPool) {
        this.hasSwimmingPool = hasSwimmingPool;
    }
}
