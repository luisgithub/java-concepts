package com.lugarsoft.java_concepts.solid.dependencyinversion;


public class PayPalPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
