package com.xworkz;

public class State {
    String name;
    long population;
    City[] cities;

    State(String name, long population, City[] cities) {
        this.name = name;
        this.population = population;
        this.cities = cities;
    }
}
