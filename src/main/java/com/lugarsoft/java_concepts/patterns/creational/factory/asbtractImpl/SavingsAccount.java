package com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl;

public class SavingsAccount extends Account{

    public SavingsAccount(){
        super(AccountType.SAVINGS);
    }
    @Override
    protected void calculateInterest() {
        double interest = 2d;
        double gainedInterest = this.getBalance() * interest;
        this.setBalance(this.getBalance() + gainedInterest);
    }
}
