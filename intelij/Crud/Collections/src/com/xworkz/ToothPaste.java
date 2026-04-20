package com.xworkz;

class ToothPaste {
    String brand;
    int quantity;
    String flavor;

    ToothPaste(String brand, int quantity, String flavor) {
        this.brand = brand;
        this.quantity = quantity;
        this.flavor = flavor;
    }

    public String toString() {
        return brand + " " + quantity + " " + flavor;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ToothPaste) {
            ToothPaste t = (ToothPaste) obj;
            return this.brand.equals(t.brand) && this.quantity == t.quantity && this.flavor.equals(t.flavor);
        }
        return false;
    }
}
