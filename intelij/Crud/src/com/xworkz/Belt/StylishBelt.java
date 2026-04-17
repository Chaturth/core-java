package com.xworkz.Belt;

class StylishBelt extends Belt {

    boolean reversible;
    String buckleType;

    StylishBelt(String color, int size, double price, String[] features,
                BeltType type, Brand brand, boolean reversible, String buckleType) {
        super(color, size, price, features, type, brand);
        this.reversible = reversible;
        this.buckleType = buckleType;
    }

    @Override
    void wearBelt() {
        System.out.println("Wearing stylish belt with " + buckleType + " buckle");
    }

    @Override
    void removeBelt() {
        System.out.println("Removing stylish belt");
    }

    @Override
    public String toString() {
        return super.toString() + ", StylishBelt[reversible=" + reversible + ", buckle=" + buckleType + "]";
    }
}
