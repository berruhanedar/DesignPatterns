package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

public enum EnumProduct {
    TOMATO("Tomato"),
    CUCUMBER("Cucumber");

    private String product;

    EnumProduct(String product) {
        this.product = product;
    }

    public String getProduct() {
        return product;
    }
}
