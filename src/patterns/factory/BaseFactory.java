package patterns.factory;


import patterns.Point;
import patterns.Triangle;
import patterns.Circle;

/**
 * Created by Julia on 03.08.2018
 */
public abstract class BaseFactory {

    public abstract Circle createCircle(Point o, double r);

    public abstract Triangle createTriangle(Point x, Point y, Point z);
}
