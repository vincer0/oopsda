package com.advanced;

public class Line {
    Point2D beginPoint;
    Point2D endPoint;

    Line(Point2D beginPoint, Point2D endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    Line(float x1, float y1, float x2, float y2) {
        this.beginPoint = new Point2D(x1, y1);
        this.endPoint = new Point2D(x2, y2);
    }

    public Point2D getBeginPoint() {
        return beginPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setBeginPoint(Point2D beginPoint) {
        this.beginPoint = beginPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public double getLength() {
        return Math.abs(Math.sqrt(Math.pow(endPoint.getX() - beginPoint.getX(), 2) + Math.pow(endPoint.getY() - beginPoint.getY(), 2)));
    }

    public Point2D getMiddlePoint() {
        return new Point2D((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
    }
}
