package com.xworkz.Movie;

public class MovieRunner {
    public static void main(String[] args) {

        Director d = new Director("Rajamouli", 20);
        String[] actors = {"Prabhas", "Rana", "Anushka"};

        Movie m = new Movie("Baahubali", 160, 9.0, actors, Genre.ACTION, d);
        System.out.println(m);
        m.playMovie();
        m.stopMovie();

        System.out.println("------------");

        NewReleaseMovie nm = new NewReleaseMovie("RRR", 180, 9.2, actors,
                Genre.ACTION, d, true, "Theatre");

        System.out.println(nm);
        nm.playMovie();
        nm.stopMovie();
    }
}
