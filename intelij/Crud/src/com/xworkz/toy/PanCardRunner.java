package com.xworkz.toy;

public class PanCardRunner {
    public static void main(String[] args) {
        PanCard[] panCard = new PanCard[3];
        PanCardStore store = new PanCardStore(panCard);

        PanCard p1 = new PanCard("12345678","Rahul","Ramesh","01-01-2000","Bangalore");

        store.addPanCard(p1);
        store.updateByDOB("01-01-2000","Kiran");
        store.searchByAddress("Bangalore");
        store.display();
    }
}
