package com.facade;

public class Blackberry implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("Blackberry model number 12333");
    }

    @Override
    public void price() {
        System.out.println("Price: 1999");
    }
}
