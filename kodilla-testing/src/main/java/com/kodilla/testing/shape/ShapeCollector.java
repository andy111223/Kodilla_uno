package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> shapeCollection;

    public ShapeCollector() {
        shapeCollection = new ArrayList<>();
    }

    public void addFigure(Shape shape) {
        shapeCollection.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        shapeCollection.remove(shape);
        return true;
    }

    public Shape getFigure(int n) {
        if (n>=0 && n< shapeCollection.size()) {
            shapeCollection.get(n);
        } else {
            return null;
        }
        return shapeCollection.get(n);
    }

    public String showFigures() {
        System.out.println();
        return shapeCollection.toString();
    }

}
