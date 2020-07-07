package com.tasks.designPatterns.facade;

public class Main {
    public static void main(String[] args) {

            Product phone = new Product("iPhone 11 Pro Max", "Very expensive product", 2500.00f);
            Product tv = new Product("Samsung 50HD", "50 inch led tv", 1800.00f);

            ShopAPI shopAPI = new ShopAPI();

            shopAPI.register("userLogin", "userPassword");
            shopAPI.login("userLogin", "userPassword");

            shopAPI.addProduct(phone);
            shopAPI.addProduct(tv);

            shopAPI.listProducts();

            shopAPI.getProductByName("Samsung 50HD");

            shopAPI.buyProduct(phone);

            shopAPI.removeProduct(phone);

            shopAPI.logout();
    }
}
