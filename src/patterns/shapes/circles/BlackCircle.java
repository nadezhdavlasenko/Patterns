package patterns.shapes.circles;

import patterns.point.Point;
import patterns.shapes.Color;

import java.util.Objects;

public class BlackCircle extends Circle {

    private Color color = Color.BLACK;

    public BlackCircle(Point o, double r) {
        super(o, r);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlackCircle that = (BlackCircle) o;
        return getCenter() == that.getCenter() && getR() == that.getR();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCenter(), getR());
    }

    @Override
    public String toString() {
        return getCenter().toString() + " r = " + getR() + " Color = " + getColor();
    }

}
