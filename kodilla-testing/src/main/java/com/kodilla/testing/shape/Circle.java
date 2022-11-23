package com.kodilla.testing.shape;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void getShapeName() {
        System.out.println("This is a circle");
    }

    public double getField() {
        double pi = 3.1415;
        double field =  pi * radius * radius;
        return field;
    }
}
