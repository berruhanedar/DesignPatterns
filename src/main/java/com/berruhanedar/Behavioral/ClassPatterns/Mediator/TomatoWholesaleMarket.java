package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

import java.math.BigDecimal;

public class TomatoWholesaleMarket extends WholesaleMarket {
    public TomatoWholesaleMarket(String name, BigDecimal price, Mediator mediator) {
        super(name, EnumProduct.TOMATO, price, mediator);
    }
}
