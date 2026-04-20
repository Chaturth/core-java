package com.xworkz;

public class Wire {

    String type;
    double length;
    String color;

    public Wire(String color, double length, String type) {
        this.color = color;
        this.length = length;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + " " + length + " " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null && obj instanceof Wire){
            Wire wire = (Wire) obj;
            return type.equals(wire.type) && length==wire.length && color==wire.color;
        }
        return false;
    }


}
