package com.berruhanedar.Structural.Composite.badexample;

import java.math.BigDecimal;

public class App1 {
    public static void main(String[] args) {

        Product tomato = new Product("Tomato", BigDecimal.TEN);
        Product potato = new Product("Potato", BigDecimal.ONE);
        Product onion = new Product("Onion", BigDecimal.ONE);

        Package vegetablePackage = new Package("Vegetable Package");
        vegetablePackage.getProductList().add(tomato);
        vegetablePackage.getProductList().add(potato);
        vegetablePackage.getProductList().add(onion);

        Product speakerSystem = new Product("Speaker System", BigDecimal.valueOf(5000));
        Product headphone = new Product("Headphone", BigDecimal.valueOf(1000));

        Package technologyPackage = new Package("Technology Package");
        technologyPackage.getProductList().add(speakerSystem);
        technologyPackage.getProductList().add(headphone);

        Product ball = new Product("Ball", BigDecimal.valueOf(100));

        Basket basket = new Basket("My Basket");
        basket.getPackageList().add(vegetablePackage);
        basket.getPackageList().add(technologyPackage);
        basket.getProductList().add(ball);

        BigDecimal totalPrice = basket.getTotalPrice();
        System.out.println("Total Price: " + totalPrice);
    }
}