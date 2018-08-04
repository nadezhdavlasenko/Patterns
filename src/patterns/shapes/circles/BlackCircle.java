package patterns.shapes.circles;

import patterns.point.Point;
import patterns.shapes.Color;

public class BlackCircle extends Circle {

    public BlackCircle(Point o, double r) {
        super(o,r);
        setColor(Color.BLACK);
    }
}
