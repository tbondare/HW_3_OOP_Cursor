package AbstractClasses;

import java.util.List;

public abstract class Shape {
    protected List<Vertex> vertices;

    protected abstract String getType();

    protected abstract String getParameters();

    @Override
    public String toString() {
        String coordinates = "";
        for (Vertex v: vertices) {
            coordinates += v.toString() + ", ";
        }
        return getType() + " " + coordinates + " " + getParameters();
    }
}
