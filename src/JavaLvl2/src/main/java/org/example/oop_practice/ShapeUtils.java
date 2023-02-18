package org.example.oop_practice;

public class ShapeUtils {

    private ShapeUtils() {
    }

    public static boolean isRentagle(Figure figure) {
        return figure instanceof Rentagle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
