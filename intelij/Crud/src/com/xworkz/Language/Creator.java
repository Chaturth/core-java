package com.xworkz.Language;

class Creator {
    String name;
    int year;

    Creator(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String toString() {
        return "Creator[name=" + name + ", year=" + year + "]";
    }
}
