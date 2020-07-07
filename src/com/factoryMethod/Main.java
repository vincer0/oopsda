package com.factoryMethod;

public class Main {
    public static void main(String[] args) {
        DialogsFactory factory = new DialogsFactory();

        Dialog windowsDialog = factory.generateDialog(OperatingSystems.WINDOWS);
        windowsDialog.openDialog();

        Dialog linuxDialog = factory.generateDialog(OperatingSystems.LINUX);
        linuxDialog.openDialog();

        Dialog OSXDialog = factory.generateDialog(OperatingSystems.OSX);
        OSXDialog.openDialog();

        Dialog androidDialog = factory.generateDialog(OperatingSystems.ANDROID);
        androidDialog.openDialog();
    }
}
