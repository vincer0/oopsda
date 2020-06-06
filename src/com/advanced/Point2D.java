package com.advanced;

public class Point2D {
    private float x;
    private float y;

    Point2D() {
        this.x = 0;
        this.y = 0;
    }
    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }


}
