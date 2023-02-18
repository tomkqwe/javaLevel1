package org.example.oop_practice;

public class FigureRunner {
    public static void main(String[] args) {
        Point point1 = new Point(0, 100);
        Point point2 = new Point(100, 10);

        Point point3 = new Point(25, 30);

        Point point4 = new Point(0, 0);
        Point point5 = new Point(30, 50);
        Point point6 = new Point(60, 10);

        Rentagle rentagle = new Rentagle(point1, point2);
        Circle circle = new Circle(point3, 20.4);
        Triangle triangle = new Triangle(point4, point5, point6);

        System.out.println(rentagle);
        System.out.println(circle);
        System.out.println(triangle);

        System.out.println(ShapeUtils.isRentagle(rentagle));
        System.out.println(ShapeUtils.isTriangle(triangle));
        System.out.println(circle.isAreaEquials(circle));
    }
}
