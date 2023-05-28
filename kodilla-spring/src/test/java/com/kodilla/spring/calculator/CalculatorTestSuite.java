package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest(classes = {Display.class, Calculator.class})
class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testAddAtoB() {
        //Given
        //When
        double result = calculator.add(5,7);
        //Then
        assertEquals(12, result);
    }
    @Test
    void testSubAfromB() {
        //Given
        //When
        double result = calculator.sub(5,7);
        //Then
        assertEquals(-2, result);
    }
    @Test
    void testMulAbyB() {
//Given
        //When
        double result = calculator.mul(5,7);
        //Then
        assertEquals(35, result);
    }
    @Test
    void testDivAbyB() {
        //Given
        //When
        double result = calculator.div(5,7);
        //Then
        assertEquals(5.0/7.0, result);
    }
    @Test
    void testDivAbyZero() {
        //Given
        //When
        //Then
        assertThrows(IllegalArgumentException.class,() -> {calculator.div(5,0);});
    }
}
