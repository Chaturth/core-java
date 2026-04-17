package com.xworkz.Chain;

class Jeweller {

    String shopName;
    String city;

    Jeweller(String shopName, String city) {
        this.shopName = shopName;
        this.city = city;
    }

    public String toString() {
        return "Jeweller[name=" + shopName + ", city=" + city + "]";
    }
}
