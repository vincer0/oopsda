package com.factoryMethod;

public class WindowsDialog extends Dialog {

    WindowsDialog(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public void openDialog() {
        System.out.println("I am opening Windows Dialog");
    }
}
