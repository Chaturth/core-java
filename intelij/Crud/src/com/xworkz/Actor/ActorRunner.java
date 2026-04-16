package com.xworkz.Actor;

public class ActorRunner {
    public static void main(String[] args) {

        Manager m = new Manager("Ravi", 12);
        String[] movies = {"KGF", "Googly", "Drama"};

        Actor a = new Actor("Yash", 38, 50.0, movies, Industry.SANDALWOOD, m);
        System.out.println(a);
        a.act();
        a.attendEvent();

        System.out.println("------------");

        LeadActor la = new LeadActor("Yash", 38, 80.0, movies,
                Industry.SANDALWOOD, m, true, "Mass Hero");

        System.out.println(la);
        la.act();
        la.attendEvent();
    }
}
