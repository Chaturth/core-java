package com.xworkz;

class Sim {
    String provider;
    String type;
    double price;

    Sim(String provider, String type, double price) {
        this.provider = provider;
        this.type = type;
        this.price = price;
    }

    public String toString() {
        return provider + " " + type + " " + price;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Sim) {
            Sim s = (Sim) obj;
            return this.provider.equals(s.provider) && this.type.equals(s.type) && this.price == s.price;
        }
        return false;
    }
}
