package com.berruhanedar.Structural.Proxy;

import java.math.BigDecimal;

public class Director implements CompanyInformation {
    @Override
    public BigDecimal getTurnover() {
        return BigDecimal.valueOf(10000);
    }
}
