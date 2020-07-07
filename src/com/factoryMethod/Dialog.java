package com.factoryMethod;

public abstract class Dialog {
    protected String color;
    protected int width;
    protected int height;

    Dialog(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    public abstract void openDialog();
}
