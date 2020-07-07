package com.tasks.designPatterns.facade;

import java.util.ArrayList;
import java.util.List;

public class ProductAPI {
    private List<Product> productList;

    ProductAPI () {
        productList = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return productList;
    }

    public Product getProductByName(String name) {
        for(Product product : productList) {
            if(product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (product == null) {
            System.out.println("Błąd dodawania");
        }
        productList.add(product);
    }

    public void removeProduct(Product product) {
        if (product == null) {
            System.out.println("Błąd usuwania");
        }
        productList.remove(product);
    }
}
