package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void getShapeName() {
        System.out.println("This is a triangle");
    }

    public double getField() {
        double field = 0.5 * base * height;
        return field;
    }
}
