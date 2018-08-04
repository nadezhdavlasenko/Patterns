package patterns.shapes.circles;

import patterns.point.Point;
import patterns.shapes.Color;

public class WhiteCircle extends Circle {

    public WhiteCircle(Point o, double r) {
        super(o,r);
        setColor(Color.WHITE);
    }
}
