package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;
    public double val = 0;

    public double add(double a, double b) {
        val = a + b;
        display.displayValue(val);
        return val;
    }
    public double sub(double a, double b) {
        val = a - b;
        display.displayValue(val);
        return val;
    }
    public double mul(double a, double b) {
        val = a * b;
        display.displayValue(val);
        return val;
    }
    public double div(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        val = a / b;
        display.displayValue(val);
        return val;
    }

}
