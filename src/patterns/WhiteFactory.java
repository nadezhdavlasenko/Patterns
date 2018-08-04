package patterns;

import patterns.factory.BaseFactory;

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
