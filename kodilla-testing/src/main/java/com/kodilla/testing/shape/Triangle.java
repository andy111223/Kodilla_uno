package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public String getShapeName() {
        System.out.println("This is a triangle");
    }

    public double getField(double base, double height) {
        double field = 0.5 * base * height;
        return field;
    }
}
