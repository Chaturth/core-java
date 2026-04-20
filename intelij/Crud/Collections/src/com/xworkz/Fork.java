package com.xworkz;

class Fork {
    String material;
    int prongs;
    String size;

    Fork(String material, int prongs, String size) {
        this.material = material;
        this.prongs = prongs;
        this.size = size;
    }

    public String toString() {
        return material + " " + prongs + " " + size;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fork) {
            Fork f = (Fork) obj;
            return this.material.equals(f.material) && this.prongs == f.prongs && this.size.equals(f.size);
        }
        return false;
    }
}
