package com.factoryMethod;

public class LinuxDialog extends Dialog {

    LinuxDialog(String color, int width, int height) {
        super(color, width, height);
    }

    @Override
    public void openDialog() {
        System.out.println("I am opening Linux Dialog....");
    }
}
