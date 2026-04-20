package com.xworkz;

class Crown {
    String material;
    double price;
    int weight;

    Crown(String material, double price, int weight) {
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    public String toString() {
        return material + " " + price + " " + weight;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Crown) {
            Crown c = (Crown) obj;
            return this.material.equals(c.material) && this.price == c.price && this.weight == c.weight;
        }
        return false;
    }
}
