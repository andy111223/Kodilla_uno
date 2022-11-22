package com.kodilla.testing.shape;

public class Square implements Shape {

    public void getShapeName() {
        System.out.println("This is a square");
    }

    public double getField(double side) {
        double field =  side * side;
        return field;
    }
}
