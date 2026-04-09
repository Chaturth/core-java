package com.overriding;

public class CreditCard extends Payment {

    @Override
    void process() {
        System.out.println("Processing payment via Credit Card");
    }

}
