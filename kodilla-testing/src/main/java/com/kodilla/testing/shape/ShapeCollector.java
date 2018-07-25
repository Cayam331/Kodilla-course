package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    ArrayList<Shape> listOfFigures = new ArrayList<Shape>();

    public boolean addFigure(Shape shape) {
        listOfFigures.add(shape);
        return true;
    }

    public boolean removeFigure(Shape shape) {
        listOfFigures.remove(shape);
        return true;
    }

    public Shape getFigure(int n) {
        Shape foundShape = listOfFigures.get(n);
        return foundShape;
    }

    public void showFigures() {
        for (Shape shape : listOfFigures) {
            shape.getShapeName();
        }
    }
}
