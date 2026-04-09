package com.overriding;

public class Bus extends Transport{
    @Override
    void move() {
        System.out.println("Bus moves on roads");
    }

}
