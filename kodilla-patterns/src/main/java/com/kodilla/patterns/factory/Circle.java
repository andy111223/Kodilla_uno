package com.kodilla.patterns.factory;

public final class Circle implements Shape {
    private final String name;
    private final double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumferece() {
        return 2 * Math.PI * radius;
    }
}
