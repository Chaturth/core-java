package com.xworkz;

public class  Country {
    String name;
    President president;
    State[] states;

    Country(String name, President president, State[] states) {
        this.name = name;
        this.president = president;
        this.states = states;
    }
}
