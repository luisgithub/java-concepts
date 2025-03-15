package com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl;

import java.util.HashMap;
import java.util.Map;

public class AccountFactory {
    private final Map<AccountType, Account> accountTypeAccountMap = new HashMap<>(){{
        put(AccountType.BASIC, new BasicAccount());
        put(AccountType.SAVINGS, new SavingsAccount());
    }};

    public Account createAccount(AccountType accountType){
        return accountTypeAccountMap.get(accountType);
    }
}
