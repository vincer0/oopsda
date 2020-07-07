package com.factoryMethod;

public class DialogsFactory implements Factory {

    @Override
    public Dialog generateDialog(OperatingSystems type) {
        Dialog dialog = null;
        switch (type) {
            case OSX:
                dialog = new OSXDialog("White", 250, 300);
                break;
            case LINUX:
                dialog = new LinuxDialog("Silver", 200, 200);
                break;
            case ANDROID:
                dialog = new AndroidDialog("Black", 100, 200);
                break;
            case WINDOWS:
                dialog = new WindowsDialog("Green", 200, 300);
        }
        return dialog;
    }
}
