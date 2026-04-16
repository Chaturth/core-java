package com.xworkz.Movie;

class NewReleaseMovie extends Movie {

    boolean is3D;
    String releasePlatform;

    NewReleaseMovie(String movieName, int durationMinutes, double rating, String[] actors,
                    Genre genre, Director director, boolean is3D, String releasePlatform) {
        super(movieName, durationMinutes, rating, actors, genre, director);
        this.is3D = is3D;
        this.releasePlatform = releasePlatform;
    }

    @Override
    void playMovie() {
        System.out.println(movieName + " playing in theatres with full sound");
    }

    @Override
    void stopMovie() {
        System.out.println(movieName + " ended");
    }

    @Override
    public String toString() {
        return super.toString() + ", NewRelease[3D=" + is3D + ", platform=" + releasePlatform + "]";
    }
}
