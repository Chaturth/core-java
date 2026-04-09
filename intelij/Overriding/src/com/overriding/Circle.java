package com.overriding;

public class Circle extends Shape{
    @Override
    void area() {
        System.out.println("Area of Circle = π × r × r");
    }

}
