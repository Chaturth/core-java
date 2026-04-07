package com.xworkz.toy;

public class ShopRunner {

    public static void main(String[] args) {

        Shop[] shop = new Shop[3];

        ShopStore store=new ShopStore(shop);

        Shop s1 = new Shop("DMart",5,5000,15000,"Large");

        store.addShop(s1);

        store.update("DMart","SuperMarket");

        store.search("SuperMarket");

        store.display();
    }
}
