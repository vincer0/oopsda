package com.tasks.abstractShapes;

/**
 * zmodyfikuj klasę `Shape` tak by była to klasa abstrakcyjna
 * pola klasy `Shape` powinny być oznaczone modyfikatorem dostepu typu `protected`
 * klasa `Shape` powinna zawierać metody abstrakcyjne `getArea` i `getPerimeter`
 *
 */

public abstract class Shape {
    protected String color;
    protected boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public boolean getFilled() {
        return isFilled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String toString() {
        return String.format("Shape with color of %s and %s", color, getFilled() ? "filled" : "not filled");
    }
}
