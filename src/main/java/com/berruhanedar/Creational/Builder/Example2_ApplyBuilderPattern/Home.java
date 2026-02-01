package com.berruhanedar.Creational.Builder.Example2_ApplyBuilderPattern;

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

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getYearsBuilt() {
        return yearsBuilt;
    }

    public int getBalconyNumbers() {
        return balconyNumbers;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getNumberOfToilets() {
        return numberOfToilets;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasPlayground() {
        return hasPlayground;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }

    public boolean isHasSwimmingPool() {
        return hasSwimmingPool;
    }
}


