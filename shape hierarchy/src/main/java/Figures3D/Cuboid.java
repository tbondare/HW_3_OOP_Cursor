package Figures3D;

import Vertex.Vertex3D;

import java.util.ArrayList;

public class Cuboid extends SpaceShape {
    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D a, double width, double height, double depth) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return (width + height + depth) * 2;
    }

    @Override
    public double getVolume() {
        return Math.pow(height, 3);
    }
}
