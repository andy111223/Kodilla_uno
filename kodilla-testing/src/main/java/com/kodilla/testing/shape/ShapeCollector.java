package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeCollection;

    public ShapeCollector() {
        shapeCollection = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        //do nothing
    }

    public boolean removeFigure(Shape shape) {
        //return true temporarily
        return true;
    }

    public String getFigure(int n) {
        //returning null means that the opration was successfull
        return null;
    }

    public List<Shape> showFigures() {
        //
        return shapeCollection;
    }
}
