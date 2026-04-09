package com.overriding;

public class Admin extends  User{
    @Override
    void create() {
        System.out.println("Creating an Admin user");
    }

}
