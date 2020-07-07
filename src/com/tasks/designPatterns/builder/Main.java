package com.tasks.designPatterns.builder;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza("PizzaOne", "Thin")
                .setCheeseAmount(CheeseAmount.HIGH)
                .addMeat(Meat.CHICKEN)
                .addSauces(Sauces.BARBECUE)
                .addMushrooms()
                .addTomato();

        System.out.println(pizza.toString());
    }
}
