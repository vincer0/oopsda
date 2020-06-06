package com.advanced;

public class Point3D {
    private float x;
    private float y;
    private float z;

    Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public float getZ() {
        return z;
    }

    public float[] getXYZ() {
        return new float[] {x, y, z};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}
