package patterns.shapes.triangles;

import patterns.point.Point;
import patterns.shapes.Color;

import java.util.Objects;

public class BlackTriangle extends Triangle {


    public BlackTriangle(Point x, Point y, Point z) {
        super(x, y, z);
        setColor(Color.BLACK);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BlackTriangle that = (BlackTriangle) o;
        return Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getColor());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Point 1: " + getX() + "; " +
                "Point 2: " + getY() + "; " +
                "Point 3: " + getZ() + "; " +
                " color= " + getColor()  +
                '}';
    }
}
