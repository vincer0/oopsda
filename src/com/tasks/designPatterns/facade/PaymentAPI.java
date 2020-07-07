package com.tasks.designPatterns.facade;

public class PaymentAPI {
    public void pay(float amount) {
        System.out.println(String.format("Paid: %.2f for service", amount));
    };
}
