package com.kodilla.testing.shape;

public class Circle implements Shape {

    public void getShapeName() {
        System.out.println("This is a circle");
    }

    public double getField(double radius) {
        double pi = 3.1415;
        double field =  pi * radius * radius;
        return field;
    }
}
