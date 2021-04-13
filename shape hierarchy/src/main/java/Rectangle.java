import java.util.ArrayList;

public class Rectangle extends PlaneShape {
    private int width;
    private int height;

    public Rectangle(Vertex2D a, int width, int height) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    protected String getType() {
        return "Rectangle";
    }
}
