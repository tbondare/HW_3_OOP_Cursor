package Figures3D;

import Vertex.Vertex3D;

import java.util.ArrayList;

public class SquarePyramid extends SpaceShape {
    private double width;
    private double height;

    public SquarePyramid(Vertex3D a, double width, double height) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * width * ((width / 2 * Math.tan(45)) + Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2 * Math.tan(45), 2)));
    }

    @Override
    public double getVolume() {
        return (double) 1 / 3 * width * width * Math.pow(height, 2);
    }
}
