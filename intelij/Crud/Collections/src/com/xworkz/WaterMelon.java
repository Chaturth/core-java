package com.xworkz;

class WaterMelon {
    double weight;
    String origin;
    String taste;

    WaterMelon(double weight, String origin, String taste) {
        this.weight = weight;
        this.origin = origin;
        this.taste = taste;
    }

    public String toString() {
        return weight + " " + origin + " " + taste;
    }

    public boolean equals(Object obj) {
        if (obj instanceof WaterMelon) {
            WaterMelon w = (WaterMelon) obj;
            return this.weight == w.weight && this.origin.equals(w.origin) && this.taste.equals(w.taste);
        }
        return false;
    }
}
