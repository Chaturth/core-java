package com.xworkz.Plate;

class Manufacturer {

    String name;
    String location;

    Manufacturer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String toString() {
        return "Manufacturer[name=" + name + ", location=" + location + "]";
    }
}
