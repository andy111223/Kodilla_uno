package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SpicyChocolateChipsDecorator extends AbstractPizzaOrderDecorator{
    public SpicyChocolateChipsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(6));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + spicy chocolate chips";
    }
}