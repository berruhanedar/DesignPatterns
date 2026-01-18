package com.berruhanedar.Behavioral.ClassPatterns.ChainOfResponsibility;

public class App {
    public static void main(String[] args) {
        ShippingCompany bhShippingCompany = BhShippingCompany.getNextShippingCompany();
        bhShippingCompany.handleShipment(EnumCity.ISTANBUL);
        System.out.println("---------------------------------");
        bhShippingCompany.handleShipment(EnumCity.KARS);
    }
}
