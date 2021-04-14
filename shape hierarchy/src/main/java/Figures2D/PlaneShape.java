package Figures2D;

import AbstractClasses.Shape;
import Interfaces.AreaMeasurable;
import Interfaces.PerimeterMeasurable;
import Vertex.Vertex2D;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    protected double distanceBetweenTwo2DVertices(Vertex2D first, Vertex2D second) {
        return Math.sqrt(Math.pow((first.getX() - second.getX()), 2) + Math.pow((first.getY() - second.getY()), 2));
    }

    @Override
    protected String getParameters() {
        return "Perimeter: " + getPerimeter() + " Area: " + getArea();
    }

    @Override
    public abstract double getPerimeter();

    @Override
    public abstract double getArea();
}
