package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MushroomPizzaDecorator extends AbstractPizzaDecorator{
    public MushroomPizzaDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost(){
        return super.getCost().add(new BigDecimal(15));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + mushrooms";
    }
}
