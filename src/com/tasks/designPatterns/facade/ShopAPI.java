package com.tasks.designPatterns.facade;

public class ShopAPI {
        private PaymentAPI paymentAPI;
        private ProductAPI productAPI;
        private UserAPI userAPI;

        ShopAPI() {
            paymentAPI = new PaymentAPI();
            productAPI = new ProductAPI();
            userAPI = new UserAPI();
        }
        public void register(String login, String password) {
            userAPI.register(login, password);
        }

        public void login(String login, String password) {
            userAPI.login(login, password);
        }

        public void logout() {
            userAPI.logout();
        }

        public void buyProduct(Product product) {
            paymentAPI.pay(product.getPrice());
        }

        public void addProduct(Product product) {
            productAPI.addProduct(product);
        }

        public void removeProduct(Product product) {
            productAPI.removeProduct(product);
        }

        public void listProducts() {
            System.out.println(productAPI.getProducts());
        }

        public void getProductByName(String name) {
            System.out.println(productAPI.getProductByName(name).toString());
        }
}
