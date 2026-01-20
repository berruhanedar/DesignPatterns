package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

import java.math.BigDecimal;

public abstract class Producer {
    private String name;
    private EnumProduct product;
    private BigDecimal price;

    private Mediator mediator;

    public Producer(String name, EnumProduct product, BigDecimal price, Mediator mediator) {
        this.name = name;
        this.product = product;
        this.price = price;
        this.mediator = mediator;
    }

    public void sellProduct(){
        mediator.collectFromProducer(this);
    }



    public String getName() {
        return name;
    }

    public EnumProduct getProduct() {
        return product;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
