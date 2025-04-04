package com.lugarsoft.java_concepts.solid.dependencyinversion;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    private final PaymentProcessor paymentProcessor;

    public PaymentService(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    /*
      Dependency Inversion Principle (DIP) states:
      1. High level modules should not depend on low level modules, Both should
         depend on abstractions.
      2. Abstractions should not depend on details. Details should depend on
         abstractions.

     */

    public void makePayment(double amount ){
        paymentProcessor.processPayment(amount);
    }
}
