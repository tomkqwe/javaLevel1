package org.example.hw3;

import java.io.InputStream;

public class RentagleRunner {
    public static void main(String[] args) {
        Point point1 = new Point(2, 10);
        Point point2 = new Point(12, 4);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));

        Rentagle rentagle = new Rentagle(point1,point2);
        System.out.println(rentagle.getArea());
        System.out.println(rentagle.getDiagonal());

    }


}
