package com.overriding;

public class Car extends Vehicle{

    @Override
    void speed() {
        System.out.println("Car speed is normally fast");
    }
}
