package com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl;

import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.Payment;

public class GooglePayment implements Payment {
    @Override
    public void createPayment() {
        System.out.println("processing Google Payment..");
    }
}
