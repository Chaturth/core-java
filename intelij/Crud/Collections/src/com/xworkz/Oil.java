package com.xworkz;

class Oil {
    String brand;
    double price;
    String type;

    Oil(String brand, double price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public String toString() {
        return brand + " " + price + " " + type;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Oil) {
            Oil o = (Oil) obj;
            return this.brand.equals(o.brand) && this.price == o.price && this.type.equals(o.type);
        }
        return false;
    }
}
