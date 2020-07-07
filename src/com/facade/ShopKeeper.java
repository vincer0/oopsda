package com.facade;

public class ShopKeeper {
    private MobileShop iphone;
    private MobileShop samsung;
    private MobileShop blackberry;

    ShopKeeper() {
        iphone = new Iphone();
        samsung = new Samsung();
        blackberry = new Blackberry();
    }

    public void iPhoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

    public void blackberrySale() {
        blackberry.modelNo();
        blackberry.price();
    }
}
