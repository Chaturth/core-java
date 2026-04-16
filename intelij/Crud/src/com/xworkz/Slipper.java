package com.xworkz;

public class Slipper {
    int size;
    String color;
    double price;
    int[] ratings;
    Brand brand;
    Material material;

    Slipper(int size, String color, double price, int[] ratings, Brand brand, Material material) {
        this.size = size;
        this.color = color;
        this.price = price;
        this.ratings = ratings;
        this.brand = brand;
        this.material = material;
    }

    void wear() {
        System.out.println("Wearing the slipper");
    }

    void display() {
        System.out.println("Displaying the slipper");
    }

    public String toString() {
        return "Slipper[size=" + size + ", color=" + color + ", price=" + price + ", brand=" + brand + ", material=" + material + "]";
    }
}
