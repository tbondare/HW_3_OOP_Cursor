package Figures2D;

import Vertex.Vertex2D;

import java.util.ArrayList;

public class Circle extends PlaneShape {
    private int radius;

    public Circle(Vertex2D a, int radius) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
