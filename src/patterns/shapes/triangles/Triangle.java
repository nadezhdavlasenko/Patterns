package patterns.shapes.triangles;

import patterns.point.Point;
import patterns.shapes.Color;

import java.util.Objects;


public abstract class Triangle {

    private Color color;
    private Point x;
    private Point y;
    private Point z;

    public Triangle(Point x, Point y, Point z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point getX() {
        return x;
    }

    public void setX(Point x) {
        this.x = x;
    }

    public Point getY() {
        return y;
    }

    public void setY(Point y) {
        this.y = y;
    }

    public Point getZ() {
        return z;
    }

    public void setZ(Point z) {
        this.z = z;
    }

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle that = (Triangle) o;
        return Objects.equals(x, that.x) &&
                Objects.equals(y, that.y) &&
                Objects.equals(z, that.z);

    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "AbstractTriangle{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}

