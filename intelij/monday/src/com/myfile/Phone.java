package com.myfile;

public class Phone {
    public static void main(String[] args) {
        System.out.println("executing phone runner in phone");

        PhoneRunner phone = new PhoneRunner();
        System.out.println(phone.name);
        phone.display();
    }
}
