package org.example.oop_practice;


public class Rentagle extends Figure implements WithDiagonal {
    private Point leftUpperPoint;
    private Point rightDownPoint;

    public Rentagle(Point leftUpperPoint, Point rightDownPoint) {
        this.leftUpperPoint = leftUpperPoint;
        this.rightDownPoint = rightDownPoint;
    }

    public Point getLeftUpperPoint() {
        return leftUpperPoint;
    }

    public void setLeftUpperPoint(Point leftUpperPoint) {
        this.leftUpperPoint = leftUpperPoint;
    }

    public Point getRightDownPoint() {
        return rightDownPoint;
    }

    public void setRightDownPoint(Point rightDownPoint) {
        this.rightDownPoint = rightDownPoint;
    }

    @Override
    public double getDiagonal() {
        return leftUpperPoint.distance(rightDownPoint);
    }

    @Override
    public double getArea() {
        return (rightDownPoint.getX() - leftUpperPoint.getX()) * (leftUpperPoint.getY() - rightDownPoint.getY());
    }
}
