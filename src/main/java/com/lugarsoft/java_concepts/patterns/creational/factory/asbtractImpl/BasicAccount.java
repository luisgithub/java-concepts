package com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl;

public class BasicAccount extends Account{
    public BasicAccount(){
        super(AccountType.BASIC);
    }

    @Override
    protected void calculateInterest() {
        double interest = 5d;
        double gainedInterest = this.getBalance() * interest;
        this.setBalance(this.getBalance() + gainedInterest);
    }

}
