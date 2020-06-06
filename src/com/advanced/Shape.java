package com.advanced;

public class Shape {
    private String color;
    private boolean isFilled;

    Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

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
