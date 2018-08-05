package patterns.factory;

import patterns.shapes.circles.BlackCircle;
import patterns.shapes.triangles.BlackTriangle;
import patterns.shapes.circles.Circle;
import patterns.shapes.triangles.Triangle;

import java.awt.*;

public class BlackFactory extends BaseFactory {

    @Override
    public Triangle createTriangle(Point x, Point y, Point z) {
        return new BlackTriangle(x, y, z);
    }

    @Override
    public Circle createCircle(Point o, double r) {
        return new BlackCircle(o, r);
    }

}

