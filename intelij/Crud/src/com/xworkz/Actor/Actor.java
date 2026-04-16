package com.xworkz.Actor;

class Actor {

    String actorName;
    int age;
    double salaryPerMovie;
    String[] hitMovies;
    Industry industry;
    Manager manager;

    Actor(String actorName, int age, double salaryPerMovie, String[] hitMovies, Industry industry, Manager manager) {
        this.actorName = actorName;
        this.age = age;
        this.salaryPerMovie = salaryPerMovie;
        this.hitMovies = hitMovies;
        this.industry = industry;
        this.manager = manager;
    }

    void act() {
        System.out.println(actorName + " is acting");
    }

    void attendEvent() {
        System.out.println(actorName + " attending event");
    }

    public String toString() {
        return "Actor[name=" + actorName + ", age=" + age + ", salary=" + salaryPerMovie + ", industry=" + industry + ", manager=" + manager + "]";
    }
}
