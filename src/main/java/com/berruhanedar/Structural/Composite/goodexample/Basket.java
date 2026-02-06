package com.berruhanedar.Structural.Composite.goodexample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private String name;
    private List<Payable> payableList;

    public Basket(String name) {
        this.name = name;
        this.payableList = new ArrayList<>();
    }

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Payable payable : payableList) {
            totalPrice = totalPrice.add(payable.getPrice());
        }
        return totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Payable> getPayableList() {
        return payableList;
    }

    public void setPayableList(List<Payable> payableList) {
        this.payableList = payableList;
    }
}
