package com.xworkz.Chain;

class Chain {

    String design;
    int length;
    double price;
    String[] occasions;
    ChainType type;
    Jeweller jeweller;

    Chain(String design, int length, double price, String[] occasions, ChainType type, Jeweller jeweller) {
        this.design = design;
        this.length = length;
        this.price = price;
        this.occasions = occasions;
        this.type = type;
        this.jeweller = jeweller;
    }

    void wearChain() {
        System.out.println("Wearing " + design + " chain");
    }

    void removeChain() {
        System.out.println("Removing chain");
    }

    public String toString() {
        return "Chain[design=" + design + ", length=" + length + ", price=" + price + ", type=" + type + ", jeweller=" + jeweller + "]";
    }
}
