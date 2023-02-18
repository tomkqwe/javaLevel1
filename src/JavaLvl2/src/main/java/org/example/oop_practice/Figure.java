package org.example.oop_practice;

public abstract class Figure {

    public abstract double getArea();

    public boolean isAreaEquials(Figure figure) {
        return getArea() == figure.getArea();
    }


}
