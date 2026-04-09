package com.other;

import com.xworkz.Person;

public class PersonOther extends Person {

    // חובה: call parent constructor
    public PersonOther() {
        super(22, "Java", "Chaturth", "Balehonnuru");
    }

    public void display() {
        System.out.println(name);
        System.out.println(course);

        // System.out.println(nativ);
        // System.out.println(age);
    }

    public static void main(String[] args) {
        PersonOther obj = new PersonOther();
        obj.display();
    }
}
