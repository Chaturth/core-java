package com.overriding;

public class FoodOrder extends Order{
    @Override
    void place() {
        System.out.println("Placing a food order");
    }

}
