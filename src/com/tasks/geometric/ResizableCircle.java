package com.tasks.geometric;

public class ResizableCircle implements Resizable{
    private Circle circle;

    ResizableCircle(Circle circle) {
        this.circle = circle;
    }


    @Override
    public void resize(int percent) {
        double radius = circle.getRadius();
        double newRadius = radius + ((radius * percent) / 100);
        circle.setRadius(newRadius);
    }
}
