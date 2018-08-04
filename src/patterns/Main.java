package patterns;

import patterns.factory.AbstractFactory;
import patterns.factory.BaseFactory;
import patterns.point.Point;
import patterns.shapes.Color;
import patterns.shapes.circles.Circle;
import patterns.shapes.triangles.Triangle;

public class Main {
    public static void main(String[] args) {
        Point centerCircle = new Point(4, 7);
        Point firstVertexTriangle = new Point(1, 6);
        Point secondVertexTriangle = new Point(3, 5);
        Point thirdVertexTriangle = new Point(-2, -2);

        BaseFactory factory = AbstractFactory.getFactory(Color.BLACK);

        Circle circle = factory.createCircle(centerCircle, 5.2);
        Triangle triangle = factory.createTriangle(firstVertexTriangle, secondVertexTriangle, thirdVertexTriangle);

        System.out.println("Circle created: " + circle);
        System.out.println("Triangle created: " + triangle);

        factory = AbstractFactory.getFactory(Color.WHITE);

        circle = factory.createCircle(centerCircle, 5.2);
        triangle = factory.createTriangle(firstVertexTriangle, secondVertexTriangle, thirdVertexTriangle);

        System.out.println("Circle created: " + circle);
        System.out.println("Triangle created: " + triangle);
    }

}
