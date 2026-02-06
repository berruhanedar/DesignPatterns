package com.berruhanedar.Structural.Composite.goodexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FoodPackage implements Payable {
    private String name;
    private List<Product> productList;
    private List<Package> packageList;

    public FoodPackage(String name) {
        this.name = name;
        this.productList = new ArrayList<>();
        this.packageList = new ArrayList<>();
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal totalProductPrice = PriceCalculatorUtil.getTotalProductPrice(productList);
        BigDecimal totalPackagePrice = PriceCalculatorUtil.getTotalPackagePrice(packageList);

        BigDecimal totalPrice = totalPackagePrice.add(totalProductPrice);

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
