package com.berruhanedar.Structural.Composite.goodexample;

import java.math.BigDecimal;

public class App {
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

        FoodPackage foodPackage = new FoodPackage("Food Package");
        Product oil = new Product("Oil", BigDecimal.valueOf(50));
        foodPackage.getPackageList().add(vegetablePackage);
        foodPackage.getProductList().add(oil);

        Basket basket = new Basket("My Basket");
        basket.getPayableList().add(vegetablePackage);
        basket.getPayableList().add(technologyPackage);
        basket.getPayableList().add(ball);
        basket.getPayableList().add(foodPackage);

        BigDecimal totalPrice = basket.getTotalPrice();

        System.out.println("Total Price: " + totalPrice);
    }
}
