package com.kodilla.patterns.factory;

public final class Rectangle implements Shape {

    private final String name;
    private final double width;
    private final double length;

    public Rectangle(String name, double width, double length) {
        this.name = name;
        this.width = width;
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getCircumferece() {
        return 2 * width + 2 * length;
    }
}
