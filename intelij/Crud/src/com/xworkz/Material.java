package com.xworkz;

public class Material {
    String type;
    int durability;

    Material(String type, int durability) {
        this.type = type;
        this.durability = durability;
    }

    public String toString() {
        return "Material[type=" + type + ", durability=" + durability + "]";
    }
}
