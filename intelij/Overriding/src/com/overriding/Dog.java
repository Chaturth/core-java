package com.overriding;

public class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("dog barks");
    }
}
