package com.xworkz.Belt;

class Brand {

String brandName;
String origin;

Brand(String brandName, String origin) {
    this.brandName = brandName;
    this.origin = origin;
}

public String toString() {
    return "Brand[name=" + brandName + ", origin=" + origin + "]";
}
}
