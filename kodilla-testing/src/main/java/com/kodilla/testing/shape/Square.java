package com.kodilla.testing.shape;

public class Square implements Shape {

    private final double side;
    public Square(double side) {
        this.side = side;
    }

    public void getShapeName() {
        System.out.println("This is a square");
    }

    public double getField() {
        double field = side * side;
        return field;
    }
}
