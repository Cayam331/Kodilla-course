package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    List<Continent> worldContinents = new ArrayList<Continent>();

    public BigDecimal getPeopleQuantity() {
        return worldContinents.stream().flatMap(continent -> continent.continentCountries.stream()).
                map(Country::getPeopleQuantity).
                reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
