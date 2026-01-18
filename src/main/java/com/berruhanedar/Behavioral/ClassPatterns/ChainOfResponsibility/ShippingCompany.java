package com.berruhanedar.Behavioral.ClassPatterns.ChainOfResponsibility;

public abstract class ShippingCompany { // abstract class because other branches share common behavior

    private EnumCity enumCity;
    private ShippingCompany nextShippingCompany;

    public ShippingCompany(EnumCity destinationCity) {
        this.enumCity = destinationCity;
    }

    public void handleShipment(EnumCity destinationCity) {

        logShipmentArrival(destinationCity);

        if (getEnumCity() == destinationCity) {
            logShipmentDelivered(destinationCity);
        } else if (getNextShippingCompany() != null) {
            getNextShippingCompany().handleShipment(destinationCity);
        } else {
            logOutOfService(destinationCity);
        }
    }

    private void logShipmentArrival(EnumCity destinationCity) {
        System.out.println(
                "The shipment destined for " + destinationCity.getCity() +
                        " has arrived in " + getEnumCity().getCity()
        );
    }

    private void logShipmentDelivered(EnumCity destinationCity) {
        System.out.println("Shipment delivered in " + destinationCity.getCity());
    }

    private void logOutOfService(EnumCity destinationCity) {
        System.out.println(destinationCity.getCity() + " is out of service");
    }

    public ShippingCompany getNextShippingCompany() {
        return nextShippingCompany;
    }

    public ShippingCompany setNextShippingCompany(ShippingCompany nextShippingCompany) {
        this.nextShippingCompany = nextShippingCompany;
        return this;
    }

    public EnumCity getEnumCity() {
        return enumCity;
    }
}
