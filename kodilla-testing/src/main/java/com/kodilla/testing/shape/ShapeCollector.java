package com.kodilla.testing.shape;

public class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }

    public void addFigure(Shape shape) {
        //do nothing
    }

    public boolean removeFigure(Shape shape) {
        //return true temporarily
        return true;
    }

    public Shape getFigure(int n) {
        //returning null means that the opration was successfull
        return null;
    }

    public Shape showFigures() {
        //
        return shape;
    }
}
