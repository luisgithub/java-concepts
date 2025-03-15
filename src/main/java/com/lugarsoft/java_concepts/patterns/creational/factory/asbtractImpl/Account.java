package com.lugarsoft.java_concepts.patterns.creational.factory.asbtractImpl;

public abstract class Account {
    private AccountType accountType = null;
    protected double balance = 0d;
    public Account(AccountType accountType){
        this.accountType = accountType;
    }

    protected abstract void calculateInterest();

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType(){
        return this.accountType;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withDraw(double amount){
        this.balance -= amount;
    }
}
