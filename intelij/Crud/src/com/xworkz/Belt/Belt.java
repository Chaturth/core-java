package com.xworkz.Belt;

class Belt {

    String color;
    int size;
    double price;
    String[] features;
    BeltType type;
    Brand brand;

    Belt(String color, int size, double price, String[] features, BeltType type, Brand brand) {
        this.color = color;
        this.size = size;
        this.price = price;
        this.features = features;
        this.type = type;
        this.brand = brand;
    }

    void wearBelt() {
        System.out.println("Wearing " + color + " belt");
    }

    void removeBelt() {
        System.out.println("Removing belt");
    }

    public String toString() {
        return "Belt[color=" + color + ", size=" + size + ", price=" + price + ", type=" + type + ", brand=" + brand + "]";
    }
}
