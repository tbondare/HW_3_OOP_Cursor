import Figures2D.Circle;
import Figures2D.Rectangle;
import Figures2D.Triangle;
import Figures3D.Cuboid;
import Figures3D.Sphere;
import Figures3D.SquarePyramid;
import Vertex.Vertex2D;
import Vertex.Vertex3D;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Vertex2D(2, 3), new Vertex2D(1, 2), new Vertex2D(3, 4));
        Rectangle rectangle = new Rectangle(new Vertex2D(3, 5), 6, 4);
        Circle circle = new Circle(new Vertex2D(5, 4), 6);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex3D(1, 2, 3), 4, 8);
        Cuboid cuboid = new Cuboid(new Vertex3D(4, 2, 5), 7, 7, 7);
        Sphere sphere = new Sphere(new Vertex3D(8, 5, 1), 5);

        System.out.println(triangle);
        System.out.println(rectangle);
        System.out.println(circle);
        System.out.println(squarePyramid);
        System.out.println(cuboid);
        System.out.println(sphere);

    }
}
