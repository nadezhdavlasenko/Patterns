/**
 * Color of the circle can be either Color.WHITE or Color.BLACK
 */

package patterns.shapes.circles;

import patterns.point.Point;
import patterns.shapes.Color;

public abstract class Circle {

    private Point center;
    private double r;
    private Color color;

    public Circle(Point center, double r){
        this.center = center;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public Point getCenter() {
        return center;
    }

    public Color getColor() {
        return color;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setR(double r) {
        this.r = r;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return getCenter().toString() + " r = " + getR() + " Color = " + getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return getCenter().equals(circle.getCenter()) &&
                Double.compare(circle.getR(), getR()) == 0 &&
                getColor().equals(circle.getColor());
    }

    @Override
    public int hashCode() {
        return (int) (17 + getCenter().hashCode() * 31 + getR() * 31 + getColor().hashCode() * 31);
    }


}
