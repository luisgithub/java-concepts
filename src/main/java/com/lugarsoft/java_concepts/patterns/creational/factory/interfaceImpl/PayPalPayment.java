package com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl;

public class PayPalPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("processing PayPal Payment..");
    }
}
