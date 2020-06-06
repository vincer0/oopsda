package com.advanced;

public class Circle extends Shape {
    private float radius;

    Circle() {
        super();
        this.radius = 1;
    }

    Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return String.format("Circle with radius=%.2f which is a subclass of %s", radius, super.toString());
    }

}
