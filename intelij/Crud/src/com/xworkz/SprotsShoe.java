package com.xworkz;

class SportsSlipper extends Slipper {
    boolean waterproof;
    String gripType;

    SportsSlipper(int size, String color, double price, int[] ratings, Brand brand, Material material,
                  boolean waterproof, String gripType) {
        super(size, color, price, ratings, brand, material);
        this.waterproof = waterproof;
        this.gripType = gripType;
    }

    @Override
    void wear() {
        System.out.println("Wearing sports shoe");
    }

    @Override
    void display() {
        System.out.println("Displaying sports shoes");
    }

    @Override
    public String toString() {
        return super.toString() + ", SportsSlipper[waterproof=" + waterproof + ", gripType=" + gripType + "]";
    }
}
