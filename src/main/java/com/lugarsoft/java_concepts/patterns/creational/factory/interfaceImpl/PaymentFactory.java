package com.lugarsoft.java_concepts.patterns.creational.factory.interfaceImpl;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    private static final Map<PayType, Payment> payTypeMap = new HashMap<>(){{
       put(PayType.GOOGLE_PAY, new GooglePayment());
       put(PayType.APPLE_PAY, new ApplePayment());
       put(PayType.PAY_PAL, new PayPalPayment());
       put(PayType.CREDIT_CARD, new CreditCardPeyment());
       put(PayType.CASH, new CashPayment());
    }};

    public Payment getPayment(PayType payType){
        return payTypeMap.get(payType);
    }
}
