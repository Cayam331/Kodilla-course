package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country(new BigDecimal(900));
        Country germany = new Country(new BigDecimal(1000));
        Country russia = new Country(new BigDecimal(160));

        Country unitedStates = new Country(new BigDecimal(10000));
        Country mexico = new Country(new BigDecimal(800));
        Country kanada = new Country(new BigDecimal(50));


        Continent europe = new Continent();
        europe.continentCountries.add(poland);
        europe.continentCountries.add(russia);
        europe.continentCountries.add(germany);

        Continent northAmerica = new Continent();
        northAmerica.continentCountries.add(unitedStates);
        northAmerica.continentCountries.add(mexico);
        northAmerica.continentCountries.add(kanada);

        World theWorld = new World();
        theWorld.worldContinents.add(europe);
        theWorld.worldContinents.add(northAmerica);

        //When
        BigDecimal result = theWorld.getPeopleQuantity();

        //Then
        BigDecimal expectedResult = new BigDecimal("12910");
        Assert.assertEquals(expectedResult, result);
    }
}
