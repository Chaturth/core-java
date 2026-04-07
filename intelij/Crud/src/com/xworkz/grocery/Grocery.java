package com.xworkz.grocery;

public class Grocery {

    String name;
    int price;
    String brand;
    int quantity;
    String quality;



    public Grocery(String brand, String name, int price, String quality, int quantity) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.quality = quality;
        this.quantity = quantity;
    }

    void display(){
        System.out.println("name of the grocery:"+name);
        System.out.println("price of the grocery:"+price);
        System.out.println("brand of the grocery:"+brand);
        System.out.println("quality of the grocery:"+quality);
        System.out.println("quantity of the grocery:"+quantity);
    }
}
