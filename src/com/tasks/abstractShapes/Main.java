package com.tasks.abstractShapes;

public class Main {
    public static void main(String[] args) {

        Circle dummyCircle = new Circle();
        System.out.println(dummyCircle.toString());

        Circle circle = new Circle("Blue", true, 5.0f);
        System.out.println(circle.toString());
        System.out.println(String.format("Area of circle: %.2f", circle.getArea()));
        System.out.println(String.format("Perimeter of circle: %.2f", circle.getPerimeter()));
        System.out.println();

        Rectangle dummyRectangle = new Rectangle();
        System.out.println(dummyRectangle.toString());

        Rectangle rectangle = new Rectangle("Yellow", true, 1f, 7f);
        System.out.println(rectangle.toString());
        System.out.println(String.format("Area of rectangle: %.2f", rectangle.getArea()));
        System.out.println(String.format("Perimeter of rectangle: %.2f", rectangle.getPerimeter()));
        System.out.println();

        Square square = new Square("White", true, 3);
        System.out.println(square.toString());
        System.out.println();
    }
}
