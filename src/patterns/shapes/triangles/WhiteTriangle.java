package patterns.shapes.triangles;

import patterns.point.Point;
import patterns.shapes.Color;

import java.util.Objects;

public class WhiteTriangle extends Triangle {

    public WhiteTriangle(Point x, Point y, Point z) {
        super(x, y, z);
        setColor(Color.WHITE);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WhiteTriangle that = (WhiteTriangle) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "color='" + color + '\'' +
                '}';
    }
}
