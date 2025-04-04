package com.lugarsoft.java_concepts.solid.dependencyinversion;

public class CreditCardPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}
