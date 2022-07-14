package com.kodilla.testing.calculator;

public class Calculator {

    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a+b;
    }
    public int subtract() {
        return b-a;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
