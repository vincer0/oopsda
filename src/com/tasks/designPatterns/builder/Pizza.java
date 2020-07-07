package com.tasks.designPatterns.builder;

import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

    private String name;
    private String base;
    private CheeseAmount cheeseAmount;
    private ArrayList<Vegetables> vegetablesList;
    private ArrayList<Sauces> saucesList;
    private ArrayList<Meat> meatList;

    Pizza(String name, String base) {
        this.name = name;
        this.base = base;
        cheeseAmount = CheeseAmount.LOW;
        vegetablesList = new ArrayList<>();
        saucesList = new ArrayList<>();
        meatList = new ArrayList<>();
    }

    public Pizza setCheeseAmount(CheeseAmount cheeseAmount) {
        this.cheeseAmount = cheeseAmount;
        return this;
    }

    public Pizza addMeat(Meat meat) {
        this.meatList.add(meat);
        return this;
    }

    public Pizza addMushrooms() {
        this.vegetablesList.add(Vegetables.WHITE_MUSHROOM);
        return this;
    }

    public Pizza addTomato() {
        this.vegetablesList.add(Vegetables.TOMATO);
        return this;
    }

    public Pizza addCorn() {
        this.vegetablesList.add(Vegetables.CORN);
        return this;
    }

    public Pizza addChili() {
        this.vegetablesList.add(Vegetables.CHILI);
        return this;
    }

    public Pizza addSauces(Sauces sauce) {
        this.saucesList.add(sauce);
        return this;
    }

    @Override
    public String toString() {
        return String.format("This pizza name: %s\n" +
                "Consists of: \n" +
                "Vegetables: %s\n" +
                "Meat: %s\n" +
                "Sauces: %s\n" +
                "Cheese: %s\n", name, vegetablesList, meatList, saucesList, cheeseAmount);
    }
}
