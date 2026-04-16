package com.xworkz.Movie;

class Director {
    String name;
    int experienceYears;

    Director(String name, int experienceYears) {
        this.name = name;
        this.experienceYears = experienceYears;
    }

    public String toString() {
        return "Director[name=" + name + ", experience=" + experienceYears + " yrs]";
    }
}
