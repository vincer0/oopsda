package com.tasks.movables;

public class Main {
    public static void main(String[] args) {

        MovablePoint point = new MovablePoint(0,0, 1, 1);

        point.moveUp();
        System.out.println(point.toString());

        point.moveRight();
        System.out.println(point.toString());

        point.moveDown();
        System.out.println(point.toString());

        point.moveLeft();
        System.out.println(point.toString());

        point.setXspeed(20);
        point.moveRight();
        System.out.println(point.toString());


        MovablePoint newPoint = new MovablePoint(0,0, 1, 1);
        MovableCircle circle = new MovableCircle(newPoint, 5);
        System.out.println(circle.toString());
        circle.moveUp(); // 0,1
        circle.moveRight(); // 1,1
        circle.getPoint().setYspeed(12);
        circle.moveDown(); // 1, -11
        System.out.println(circle.toString());

        circle.getPoint().moveRight();
        System.out.println(circle.toString());
    }
}
