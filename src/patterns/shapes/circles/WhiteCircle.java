package patterns.shapes.circles;

import patterns.shapes.Color;

import java.awt.*;
import java.util.Objects;

public class WhiteCircle extends Circle {

    private Color color = Color.WHITE;

    public WhiteCircle(Point o, double r) {
        super(o, r);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WhiteCircle)) return false;
        WhiteCircle that = (WhiteCircle) o;
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
