package com.kodilla.stream.world;


import java.math.BigDecimal;


public final class Country {
    private final BigDecimal numberOfPeople;

    public Country(final BigDecimal numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public BigDecimal getPeopleQuantity() {
        return numberOfPeople;
    }
}
