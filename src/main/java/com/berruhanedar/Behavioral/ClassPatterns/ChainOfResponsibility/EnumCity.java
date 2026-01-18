package com.berruhanedar.Behavioral.ClassPatterns.ChainOfResponsibility;

public enum EnumCity { // Enum with constructor
    ISTANBUL("İstanbul"),
    ANKARA("Ankara"),
    ANTALYA("Antalya"),
    CANKIRI("Çankırı"),
    KARS("Kars");

    private String city;

    EnumCity(String city) { // Enum constant + metadata
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "EnumCity{" +
                "city='" + city + '\'' +
                '}';
    }
}
