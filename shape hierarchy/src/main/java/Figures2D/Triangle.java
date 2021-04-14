package Figures2D;

import Vertex.Vertex2D;

import java.util.ArrayList;

public class Triangle extends PlaneShape {

    public Triangle(Vertex2D a, Vertex2D b, Vertex2D c) {
        vertices = new ArrayList<>();
        vertices.add(a);
        vertices.add(b);
        vertices.add(c);
    }

    @Override
    protected double distanceBetweenTwo2DVertices(Vertex2D first, Vertex2D second) {
        return super.distanceBetweenTwo2DVertices(first, second);
    }

    @Override
    public double getPerimeter() {
        double ab = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(0), (Vertex2D) vertices.get(1));
        double bc = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(1), (Vertex2D) vertices.get(2));
        double ac = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(0), (Vertex2D) vertices.get(2));
        return ab + bc + ac;
    }

    @Override
    public double getArea() {
        double ab = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(0), (Vertex2D) vertices.get(1));
        double bc = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(1), (Vertex2D) vertices.get(2));
        double ac = distanceBetweenTwo2DVertices((Vertex2D) vertices.get(0), (Vertex2D) vertices.get(2));
        double p = getPerimeter() * 0.5;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }
}
