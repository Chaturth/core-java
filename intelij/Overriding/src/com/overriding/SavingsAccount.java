package com.overriding;

public class SavingsAccount extends  BankAccount{

    @Override
    void withdraw() {
        System.out.println("Withdraw with savings account rules");
    }

}
