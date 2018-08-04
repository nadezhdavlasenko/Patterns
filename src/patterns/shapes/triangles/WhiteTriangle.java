package patterns.shapes.triangles;

import patterns.point.Point;
import patterns.shapes.Color;

import java.util.Objects;

public class WhiteTriangle extends Triangle {

    private Color color;

    public WhiteTriangle(Point x, Point y, Point z) {
        super(x, y, z);
        color = Color.WHITE;
    }

    public Color getColor() { return color; }

    public void setColor(Color color) { this.color = color; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WhiteTriangle that = (WhiteTriangle) o;
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
