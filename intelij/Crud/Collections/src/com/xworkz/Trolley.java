package com.xworkz;

class Trolley {
    String brand;
    int wheels;
    String color;

    Trolley(String brand, int wheels, String color) {
        this.brand = brand;
        this.wheels = wheels;
        this.color = color;
    }

    public String toString() {
        return brand + " " + wheels + " " + color;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Trolley) {
            Trolley t = (Trolley) obj;
            return this.brand.equals(t.brand) && this.wheels == t.wheels && this.color.equals(t.color);
        }
        return false;
    }
}
