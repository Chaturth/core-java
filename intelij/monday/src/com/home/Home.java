package com.home;

public class Home {
    public static void main(String[] args) {
        System.out.println("executing home runner in home");

        HomeRunner home = new HomeRunner();
        System.out.println(home.members);
        home.printInfo();
    }
}
