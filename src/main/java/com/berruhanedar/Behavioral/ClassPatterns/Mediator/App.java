package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Distributor distributor = new Distributor();

        TomatoProducer producerBerru = new TomatoProducer("Berru", BigDecimal.valueOf(4), distributor);
        TomatoProducer producerBurcu = new  TomatoProducer("Burcu", BigDecimal.valueOf(3), distributor);

        TomatoWholesaleMarket marketerNesrin = new TomatoWholesaleMarket("Nesrin",BigDecimal.valueOf(5), distributor);
        TomatoWholesaleMarket marketerJohn = new TomatoWholesaleMarket("John",BigDecimal.valueOf(5), distributor);

        distributor.addProducer(producerBerru);
        distributor.addProducer(producerBurcu);

        distributor.addWholesaleMarket(marketerNesrin);
        distributor.addWholesaleMarket(marketerJohn);

        producerBurcu.sellProduct();

    }
}
