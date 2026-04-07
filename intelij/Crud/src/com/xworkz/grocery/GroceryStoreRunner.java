package com.xworkz.grocery;

public class GroceryStoreRunner {

    public static void main(String[] args) {

        Grocery[] grocery = new Grocery[3];

        GroceryStore groceryStore = new GroceryStore(grocery);

        Grocery g1 = new Grocery("sunflower","oil",40,"good",2);

        groceryStore.addGrocery(g1);

        groceryStore.searchByName("oil");

        groceryStore.updateByName("oil","cooking oil");

        groceryStore.display();
    }
}
