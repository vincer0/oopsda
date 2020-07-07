package com.facade;

public class Iphone implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println("iPhone model number 11");
    }

    @Override
    public void price() {
        System.out.println("Price: 4500");
    }
}
