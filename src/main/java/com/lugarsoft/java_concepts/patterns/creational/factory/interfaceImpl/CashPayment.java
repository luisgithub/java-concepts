package com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl;

import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.Payment;

public class CashPayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("processing Cash Payment..");
    }
}
