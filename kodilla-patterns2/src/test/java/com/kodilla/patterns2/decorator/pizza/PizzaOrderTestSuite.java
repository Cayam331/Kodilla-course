package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCostAndGetDescription(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Pizza price: " + theCost + "\n" + "Pizza description: " + description);
        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
        Assert.assertEquals("Pizza with tomato sauce, cheese", description);
    }
    @Test
    public void testPizzaWithHamMushroomGarlicSauceCheeseGetDescriptionAndGetCost(){
        //Given
        PizzaOrder theOrder = new BasicPizza();
        theOrder = new CheesePizzaDecorator(theOrder);
        theOrder = new GarlicSaucePizzaDecorator(theOrder);
        theOrder = new HamPizzaDecorator(theOrder);
        theOrder = new MushroomPizzaDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        String description = theOrder.getDescription();
        System.out.println("Pizza price: " + theCost + "\n" + "Pizza description: " + description);
        //Then
        Assert.assertEquals(new BigDecimal(48), theCost);
        Assert.assertEquals("Pizza with tomato sauce, cheese + additional cheese + garlic sauce + ham + mushrooms", description);
    }
}
