package patterns.factory;

import patterns.shapes.triangles.Triangle;
import patterns.shapes.circles.Circle;

import java.awt.*;

/**
 * Created by Julia on 03.08.2018
 */
public abstract class BaseFactory {

    public abstract Circle createCircle(Point o, double r);

    public abstract Triangle createTriangle(Point x, Point y, Point z);
}
