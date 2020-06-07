package com.tasks.geometric;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(1.0f);

        System.out.println(String.format("Circle perimeter: %.2f", circle.getPerimeter()));
        System.out.println(String.format("Circle area: %.2f", circle.getArea()));

        ResizableCircle rCircle = new ResizableCircle(circle);

        rCircle.resize(10);

        System.out.println("Current circle size: " + circle.getRadius());
        System.out.println(String.format("Circle perimeter: %.2f", circle.getPerimeter()));
        System.out.println(String.format("Circle area: %.2f", circle.getArea()));
    }
}
