package patterns.shapes.triangles;

import patterns.shapes.Color;

import java.awt.*;
import java.util.Objects;

public class BlackTriangle extends Triangle {

    private Color color = Color.BLACK;

    public BlackTriangle(Point x, Point y, Point z) {
        super(x, y, z);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlackTriangle that = (BlackTriangle) o;
        return getX() == that.getX() && getY() == that.getY() && getZ() == that.getZ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getZ());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Point 1: " + getX() + "; " +
                "Point 2: " + getY() + "; " +
                "Point 3: " + getZ() + "; " +
                " color= " + getColor() +
                '}';
    }

}
