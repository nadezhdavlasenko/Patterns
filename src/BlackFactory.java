
public class BlackFactory {

    @Override
    public Triangle createBlackTriangle(Point x, Point y, Point z) {
        return new BlackTriangle(x, y, z);
    }

    @Override
    public Circle createBlackCircle(Point o, double r) {
        return new BlackCircle(o, r);
    }
}

