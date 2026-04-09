package com.overriding;

public class Freindship extends Relationship{

    @Override
    void showBond() {
        System.out.println("This is a friendship relationship.");
    }

}
