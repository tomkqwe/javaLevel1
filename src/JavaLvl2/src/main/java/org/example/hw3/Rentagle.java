package org.example.hw3;

public class Rentagle {
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

    public double getDiagonal() {
        return leftUpperPoint.distance(rightDownPoint);
    }

    public int getArea() {
        return (rightDownPoint.getX() - leftUpperPoint.getX()) * (leftUpperPoint.getY() - rightDownPoint.getY());
    }
}
