package com.xworkz.Movie;

class Movie {

    String movieName;
    int durationMinutes;
    double rating;
    String[] actors;
    Genre genre;
    Director director;

    Movie(String movieName, int durationMinutes, double rating, String[] actors, Genre genre, Director director) {
        this.movieName = movieName;
        this.durationMinutes = durationMinutes;
        this.rating = rating;
        this.actors = actors;
        this.genre = genre;
        this.director = director;
    }

    void playMovie() {
        System.out.println(movieName + " is now playing");
    }

    void stopMovie() {
        System.out.println(movieName + " stopped");
    }

    public String toString() {
        return "Movie[name=" + movieName + ", duration=" + durationMinutes + " mins, rating=" + rating + ", genre=" + genre + ", director=" + director + "]";
    }
}
