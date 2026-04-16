package com.xworkz.Concert;

class Concert {

    String concertName;
    int audienceCount;
    double ticketPrice;
    String[] performers;
    ConcertType type;
    Organizer organizer;

    Concert(String concertName, int audienceCount, double ticketPrice, String[] performers, ConcertType type, Organizer organizer) {
        this.concertName = concertName;
        this.audienceCount = audienceCount;
        this.ticketPrice = ticketPrice;
        this.performers = performers;
        this.type = type;
        this.organizer = organizer;
    }

    void startConcert() {
        System.out.println(concertName + " started");
    }

    void endConcert() {
        System.out.println(concertName + " ended");
    }

    public String toString() {
        return "Concert[name=" + concertName + ", audience=" + audienceCount + ", price=" + ticketPrice + ", type=" + type + ", organizer=" + organizer + "]";
    }
}
