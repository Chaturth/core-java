package com.xworkz.toy;

public class Toy {

    String name;
    double price;
    boolean isElectric;
    String mfgDate;
    String size;

    public Toy(boolean isElectric, String mfgDate, String name, double price, String size) {
        this.isElectric = isElectric;
        this.mfgDate = mfgDate;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    void display(){
        System.out.println("toy name:"+name);
        System.out.println("toy price:"+price);
        System.out.println("toy is electirc:"+isElectric);
        System.out.println("toys mfg date:"+mfgDate);
        System.out.println("size:"+size);
    }
}
