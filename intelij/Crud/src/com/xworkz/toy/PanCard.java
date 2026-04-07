package com.xworkz.toy;

public class PanCard {
    String panNumber;
    String holderName;
    String fatherName;
    String dateOfBirth;
    String address;

    public PanCard(String panNumber, String holderName, String fatherName, String dateOfBirth, String address) {
        this.panNumber = panNumber;
        this.holderName = holderName;
        this.fatherName = fatherName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    void display() {
        System.out.println("PAN Number: " + panNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Father Name: " + fatherName);
        System.out.println("Date Of Birth: " + dateOfBirth);
        System.out.println("Address: " + address);
    }
}
