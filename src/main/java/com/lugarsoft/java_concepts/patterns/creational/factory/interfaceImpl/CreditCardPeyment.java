package com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl;

import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.Payment;

public class CreditCardPeyment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("processing Credit Card Payment..");
    }
}
