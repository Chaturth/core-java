package com.xworkz.toy;

public class ShopStore {

    Shop[] shop;
    int currentIndex = 0;

    public ShopStore(Shop[] shop) {
        this.shop = shop;
    }

    void addShop(Shop shops) {
        int index = shop.length;
        if (shops != null) {
            if (currentIndex < index) {
                shop[currentIndex] = shops;
                currentIndex++;
                System.out.println("Shop is added");
                System.out.println("shop name:" + shops.name);
            }
        } else {
            System.out.println("array is full ");
        }
    }

    void display() {
        for (Shop shop : this.shop) {
            if (shop != null) {
                shop.display();
            }
        }
    }

    void search(String name) {
        boolean found = false;
        if (shop != null) {
            for (Shop s : shop) {
                if (s != null && s.name.equals(name)) {
                    System.out.println("toy is found");
                    System.out.println("toy:" + s.name);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("toy is not found");
        }
    }

        void update (String name, String newName){
            boolean found = false;
            if (shop != null) {
                for (Shop s : shop) {
                    if (s != null && s.name.equals(name)) {
                        s.name = newName;
                        System.out.println("Shop is updated");
                        System.out.println("shop employees salary:" + s.salary);
                        System.out.println("shop name:" + s.name);
                        found = true;
                        break;
                    }
                }
            }
            if (!found) {
                System.out.println("toy is not updates");
            }
        }
}
