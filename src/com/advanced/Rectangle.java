package com.advanced;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    public String toString() {
        return String.format("Rectangle with width=%.2f and length=%.2f which is a subclass of %s", width, length, super.toString());
    }
}
