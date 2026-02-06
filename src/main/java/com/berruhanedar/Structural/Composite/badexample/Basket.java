package com.berruhanedar.Structural.Composite.badexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Poor Composite Pattern Design ❌
 *
 * This design violates the Open-Closed Principle (OCP).
 * The Basket class depends on concrete classes such as Product, Package, and FoodPackage.
 *
 * Whenever a new component type is introduced, the Basket class must be modified.
 * This makes the system rigid and difficult to extend.
 *
 * A proper Composite Pattern should rely on a common abstraction (e.g., Component interface)
 * instead of concrete implementations.
 */

public class Basket {
    private String name;
    private List<Product> productList;
    private List<Package> packageList;
    private List<FoodPackage> foodPackage;

    public Basket(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packageList = new ArrayList<>();
        this.foodPackage = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product : productList) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        for (Package pkg : packageList) {
            List<Product> productList = pkg.getProductList();
            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }

        for (FoodPackage foodPackage : foodPackage) {
            List<Product> productList = foodPackage.getProductList();
            List<Package> packageList = foodPackage.getPackageList();

            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
            for (Package pkg : packageList) {
                List<Product> productList1 = pkg.getProductList();
                for (Product product : productList1) {
                    totalPrice = totalPrice.add(product.getPrice());
                }
            }
        }

        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Package> getPackageList() {
        return packageList;
    }

    public void setPackageList(List<Package> packageList) {
        this.packageList = packageList;
    }
}
