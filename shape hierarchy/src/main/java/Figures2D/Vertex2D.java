package Figures2D;

import AbstractClasses.Vertex;

public class Vertex2D extends Vertex {
    private int x;
    private int y;

    public Vertex2D() {}

    public Vertex2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
