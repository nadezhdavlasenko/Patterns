/**
 * Color of the circle can be either Color.WHITE or Color.BLACK
 */

package patterns.shapes.circles;

import patterns.point.Point;

public abstract class Circle {

    private Point center;
    private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setR(double r) {
        this.r = r;
    }

}
