package com.facade;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Samsung model S10");
    }

    @Override
    public void price() {
        System.out.println("Price: 999");
    }
}
