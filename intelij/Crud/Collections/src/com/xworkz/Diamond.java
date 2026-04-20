package com.xworkz;

class Diamond {
    double carat;
    String color;
    double price;

    Diamond(double carat, String color, double price) {
        this.carat = carat;
        this.color = color;
        this.price = price;
    }

    public String toString() {
        return carat + " " + color + " " + price;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Diamond) {
            Diamond d = (Diamond) obj;
            return this.carat == d.carat && this.color.equals(d.color) && this.price == d.price;
        }
        return false;
    }
}
