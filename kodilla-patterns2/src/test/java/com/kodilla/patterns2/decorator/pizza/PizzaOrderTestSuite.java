package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }
    @Test
    void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza", description);
    }
    @Test
    void testBasicPizzaWithAdditionalCheeseSeaweedAndSpicyChocolateChipsOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new SeaweedsDecorator(theOrder);
        theOrder = new SpicyChocolateChipsDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(33), theCost);
    }
    @Test
    void testBasicPizzaWithAdditionalCheeseSeaweedAndSpicyChocolateChipsOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new AdditionalCheeseDecorator(theOrder);
        theOrder = new SeaweedsDecorator(theOrder);
        theOrder = new SpicyChocolateChipsDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic pizza + additional cheese + seaweeds + spicy chocolate chips", description);
    }
}
