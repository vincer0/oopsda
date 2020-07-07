package com.tasks.designPatterns.facade;

public class UserAPI {
    private String login;
    private String password;

    public void register(String login, String password) {
        System.out.println(String.format("Registered with login: %s, password: %s", login, password));
    }

    public void login(String login, String password) {
        System.out.println(String.format("Logged with login: %s, password: %s", login, password));
    }

    public void logout() {
        System.out.println("Logged Out");
    }
}
