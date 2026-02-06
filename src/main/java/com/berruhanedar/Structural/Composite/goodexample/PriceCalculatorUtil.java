package com.berruhanedar.Structural.Composite.goodexample;

import java.math.BigDecimal;
import java.util.List;

public class PriceCalculatorUtil {
    public static BigDecimal getTotalProductPrice(List<Product> productLists) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Product product : productLists) {
            totalPrice = totalPrice.add(product.getPrice());
        }
        return totalPrice;
    }

    public static BigDecimal getTotalPackagePrice(List<Package> packageLists) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Package pkg : packageLists) {
            List<Product> productList = pkg.getProductList();
            for (Product product : productList) {
                totalPrice = totalPrice.add(product.getPrice());
            }
        }
        return totalPrice;
    }





}
