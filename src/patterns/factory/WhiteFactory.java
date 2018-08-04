package patterns.factory;

import patterns.shapes.circles.Circle;
import patterns.point.Point;
import patterns.shapes.triangles.Triangle;
import patterns.shapes.triangles.WhiteTriangle;

public class WhiteFactory extends BaseFactory {
    public WhiteFactory() {

    }

    @Override
    public Triangle createTriangle(Point x, Point y, Point z) {
        return new WhiteTriangle(x, y, z);
    }

    @Override
    public Circle createCircle(Point o, double r) {
        return new WhiteCircle(o, r);
    }
}
