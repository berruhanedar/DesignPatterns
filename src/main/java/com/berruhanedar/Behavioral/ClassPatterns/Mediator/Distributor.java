package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Distributor implements Mediator {

    private List<Producer> producerList;
    private List<WholesaleMarket> wholesaleMarketList;

    public Distributor() {
        producerList = new ArrayList<>();
        wholesaleMarketList = new ArrayList<>();
    }

    @Override
    public void addProducer(Producer producer) {
        producerList.add(producer);
    }

    @Override
    public void addWholesaleMarket(WholesaleMarket wholesaleMarket) {
        wholesaleMarketList.add(wholesaleMarket);
    }

    @Override
    public void collectFromProducer(Producer producer) {
        WholesaleMarket wholesaleMarket = findBestWholesaleMarket(producer.getProduct());
        sold(producer, wholesaleMarket);
    }

    @Override
    public void sellToWholesaleMarket(WholesaleMarket wholesaleMarket) {
        Producer producer = findBestProducer(wholesaleMarket.getProduct());
        sold(producer, wholesaleMarket);

    }

    private static void sold(Producer producer, WholesaleMarket wholesaleMarket) {
        System.out.println(producer.getName() + " sold " + producer.getProduct() + " to " + wholesaleMarket.getName());
    }

    private Producer findBestProducer(EnumProduct product) {
        Producer bestProducer = null;
        for (Producer producer : producerList) {
            if (producer.getProduct().equals(product)) {
                BigDecimal price = producer.getPrice();
                if (bestProducer == null || bestProducer.getPrice().compareTo(price) > 0) {
                    bestProducer = producer;
                }
            }
        }
        return bestProducer;
    }

    private WholesaleMarket findBestWholesaleMarket(EnumProduct product) {
        WholesaleMarket bestMarket = null;
        for (WholesaleMarket market : wholesaleMarketList) {
            if (market.getProduct().equals(product)) {
                BigDecimal price = market.getPrice();
                if (bestMarket == null || bestMarket.getPrice().compareTo(price) < 0) {
                    bestMarket = market;
                }
            }
        }
        return bestMarket;
    }

}
