package com.statics;

public class Main {
    public static void main(String[] args) {
        User user = new User("Adam", "Pasierb", 27, 93040815079L, "Polska", 2342, false);

        System.out.println(User.showUser(user));
    }
}
