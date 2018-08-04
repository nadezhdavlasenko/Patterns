package patterns;

import patterns.factory.BaseFactory;

public class BlackFactory extends BaseFactory{

    @Override
    public Triangle createTriangle(Point x, Point y, Point z) {
        return new BlackTriangle(x, y, z);
    }

    @Override
    public Circle createCircle(Point o, double r) {
        return new BlackCircle(o, r);
    }
}

