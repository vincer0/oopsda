package com.statics;

public class User {
    private final String name;
    private final long pesel;

    private String lastName;
    private int age;
    private String country;
    private float income;
    private boolean isCriminal;

    User(String name, String lastName, int age, long pesel, String country, float income, boolean isCriminal) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        this.country = country;
        this.income = income;
        this.isCriminal = isCriminal;
    }

    public static String showUser(User user) {
        return String.format("Name: %s, Last Name: %s, Age: %d, PESEL: %d, Country: %s, Gain: %.2f, Criminal: %s",
                user.name, user.lastName, user.age, user.pesel, user.country, user.income, user.isCriminal);
    }

}
