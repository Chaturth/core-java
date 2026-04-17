package com.xworkz.Plate;

class Plate {

    String color;
    int diameter;
    double price;
    String[] uses;
    PlateType type;
    Manufacturer manufacturer;

    Plate(String color, int diameter, double price, String[] uses, PlateType type, Manufacturer manufacturer) {
        this.color = color;
        this.diameter = diameter;
        this.price = price;
        this.uses = uses;
        this.type = type;
        this.manufacturer = manufacturer;
    }

    void usePlate() {
        System.out.println("Using " + color + " plate");
    }

    void washPlate() {
        System.out.println("Washing plate");
    }

    public String toString() {
        return "Plate[color=" + color + ", diameter=" + diameter + ", price=" + price + ", type=" + type + ", manufacturer=" + manufacturer + "]";
    }
}
