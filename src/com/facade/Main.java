package com.facade;

public class Main {
    public static void main(String[] args) {
        ShopKeeper shopKeeper = new ShopKeeper();

        shopKeeper.blackberrySale();
        shopKeeper.iPhoneSale();
        shopKeeper.samsungSale();
    }
}
