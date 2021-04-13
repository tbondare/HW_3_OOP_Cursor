package Figures3D;

import java.util.ArrayList;

public class Sphere extends SpaceShape {
    private double radius;

    public Sphere(Vertex3D a, double radius) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.radius = radius;
    }

    @Override
    protected String getType() {
        return "Sphere";
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (double) 4/3 * Math.PI * Math.pow(radius, 3);
    }
}
