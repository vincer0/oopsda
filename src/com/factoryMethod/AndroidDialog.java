package com.factoryMethod;

public class AndroidDialog extends Dialog {

    AndroidDialog(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public void openDialog() {
        System.out.println("I am opening Android Dialog...");
    }
}
