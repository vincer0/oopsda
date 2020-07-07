package com.factoryMethod;

public class OSXDialog extends Dialog {

    OSXDialog(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public void openDialog() {
        System.out.println("I am opening OSX Dialog...");
    }

    public boolean method() {
        return false;
    }

    public boolean method(int name) {
    return false;
    }
}
