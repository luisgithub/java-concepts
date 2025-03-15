package com.lugarsoft.java_concepts;


import com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl.Account;
import com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl.AccountFactory;
import com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl.AccountType;
import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.PayType;
import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.Payment;
import com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl.PaymentFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class CreationalPatternTest {

    @Test
    void factory_design_pattern_test(){
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment googlePayment = paymentFactory.getPayment(PayType.GOOGLE_PAY);
        Assertions.assertNotNull(googlePayment);
        googlePayment.createPayment();
        Payment paypalPayment = paymentFactory.getPayment(PayType.PAY_PAL);
        Assertions.assertNotNull(paypalPayment);
        paypalPayment.createPayment();
    }

    @Test
    void factory_design_pattern_abstract_implementation(){
        AccountFactory accountFactory = new AccountFactory();
        Account basicAccount = accountFactory.createAccount(AccountType.BASIC);
        basicAccount.deposit(100.00d);
        Assertions.assertEquals(basicAccount.getBalance(), 100.00d);
        System.out.println("Basic Account Balance: " + basicAccount.getBalance());
        Account savingsAccount = accountFactory.createAccount(AccountType.SAVINGS);
        savingsAccount.deposit(59.36d);
        Assertions.assertEquals(savingsAccount.getBalance(), 59.36d);
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
    }
}

