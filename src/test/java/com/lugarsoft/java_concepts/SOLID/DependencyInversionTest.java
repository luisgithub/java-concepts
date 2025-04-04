package com.lugarsoft.java_concepts.SOLID;

import com.lugarsoft.java_concepts.solid.dependencyinversion.CreditCardPaymentProcessor;
import com.lugarsoft.java_concepts.solid.dependencyinversion.PayPalPaymentProcessor;
import com.lugarsoft.java_concepts.solid.dependencyinversion.PaymentProcessor;
import com.lugarsoft.java_concepts.solid.dependencyinversion.PaymentService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DependencyInversionTest {


    @Mock
    PaymentService paymentService;

    @Test
    void inversion_dependency_payment_processor(){
        PaymentProcessor creditCardPayment = new CreditCardPaymentProcessor();
        PaymentService paymentService = new PaymentService(creditCardPayment);
        paymentService.makePayment(100.0); // Output: Processing credit card payment of $100.0
        Mockito.verify(paymentService).makePayment(100.0);
        PaymentProcessor paypalPayment = new PayPalPaymentProcessor();
        paymentService = new PaymentService(paypalPayment);
        paymentService.makePayment(200.0); // Output: Processing PayPal payment of $200.0
        Mockito.verify(paymentService).makePayment(200.0);
    }
}
