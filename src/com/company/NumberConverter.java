package com.company;

public class NumberConverter {

    private int value;

    public NumberConverter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String toBinary() {
        return Integer.toBinaryString(getValue());
    }

    public String toHex() {
        return Integer.toHexString(getValue());
    }
}
