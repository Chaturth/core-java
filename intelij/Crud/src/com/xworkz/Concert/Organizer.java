package com.xworkz.Concert;

class Organizer {

    String organizerName;
    String city;

    Organizer(String organizerName, String city) {
        this.organizerName = organizerName;
        this.city = city;
    }

    public String toString() {
        return "Organizer[name=" + organizerName + ", city=" + city + "]";
    }
}
