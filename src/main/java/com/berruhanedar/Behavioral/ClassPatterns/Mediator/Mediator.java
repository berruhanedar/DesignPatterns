package com.berruhanedar.Behavioral.ClassPatterns.Mediator;

public interface Mediator {
    void addProducer(Producer producer);
    void addWholesaleMarket(WholesaleMarket wholesaleMarket);

    void collectFromProducer(Producer producer);
    void sellToWholesaleMarket(WholesaleMarket wholesaleMarket);

}
