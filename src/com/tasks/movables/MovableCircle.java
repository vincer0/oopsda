package com.tasks.movables;

public class MovableCircle implements Movable{

    private MovablePoint point;
    private int radius;

    MovableCircle(MovablePoint point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public MovablePoint getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return String.format("Position: %s, Radius: %d", point.toString(), radius);
    }

    @Override
    public void moveUp() {
        this.point.moveUp();
    }

    @Override
    public void moveDown() {
        this.point.moveDown();
    }

    @Override
    public void moveLeft() {
        this.point.moveLeft();
    }

    @Override
    public void moveRight() {
        this.point.moveRight();
    }
}
